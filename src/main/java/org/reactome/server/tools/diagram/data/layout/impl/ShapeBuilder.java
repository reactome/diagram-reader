package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;
import org.reactome.server.tools.diagram.data.layout.Shape;

import java.awt.*;
import java.awt.font.FontRenderContext;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.List;

/**
 * Calculates the points of the different shapes (circle, arrow, stop).
 *
 * @author Kostas Sidiropoulos (ksidiro@ebi.ac.uk)
 */
@SuppressWarnings("WeakerAccess")
public abstract class ShapeBuilder {
	public static final double ARROW_ANGLE = Math.PI / 6;
	public static final int ARROW_LENGTH = 8;
	public static final int EDGE_TYPE_WIDGET_WIDTH = 12;
	public static final int CIRCLE_WIDGET_CORRECTION = 1;
	public static final int EDGE_MODULATION_WIDGET_WIDTH = 8;
	//public static double GENE_SYMBOL_PAD = 4;
	//public static double GENE_SYMBOL_WIDTH = 50;

	public static List<Coordinate> createArrow(
			double arrowPositionX,
			double arrowPositionY,
			double controlX,
			double controlY) {
		// IMPORTANT!!! Segments start from the node and point to the backbone
		// Point used to calculate the angle of the arrow
		// Point used to place the  arrow

		double arrowLength = ARROW_LENGTH;
		double arrowAngle = ARROW_ANGLE;

		List<Coordinate> rtn = new LinkedList<>();

		// Get the angle of the line segment
		double alpha = Math.atan((arrowPositionY - controlY) / (arrowPositionX - controlX));
		if (controlX > arrowPositionX)
			alpha += Math.PI;
		double angle = arrowAngle - alpha;
		double x1 = arrowPositionX - arrowLength * Math.cos(angle);
		double y1 = arrowPositionY + arrowLength * Math.sin(angle);
		rtn.add(new CoordinateImpl(x1, y1));
		// The tip of the arrow is the end of the segment
		rtn.add(new CoordinateImpl(arrowPositionX, arrowPositionY));

		angle = arrowAngle + alpha;
		double x2 = arrowPositionX - arrowLength * Math.cos(angle);
		double y2 = arrowPositionY - arrowLength * Math.sin(angle);
		rtn.add(new CoordinateImpl(x2, y2));
		return rtn;
	}

	public static List<Coordinate> createStop(
			double anchorX,
			double anchorY,
			double controlX,
			double controlY) {

		List<Coordinate> rtn = new LinkedList<>();

		double deltaY = anchorY - controlY;
		double deltaX = controlX - anchorX;

		double angle = deltaY == 0 ? Math.PI / 2 : Math.atan(-deltaX / deltaY);
		double x1 = anchorX - Math.cos(angle) * EDGE_MODULATION_WIDGET_WIDTH / 2.0d;
		double x2 = anchorX + Math.cos(angle) * EDGE_MODULATION_WIDGET_WIDTH / 2.0d;
		double y1 = anchorY + Math.sin(angle) * EDGE_MODULATION_WIDGET_WIDTH / 2.0d;
		double y2 = anchorY - Math.sin(angle) * EDGE_MODULATION_WIDGET_WIDTH / 2.0d;

		rtn.add(new CoordinateImpl(x1, y1));
		rtn.add(new CoordinateImpl(x2, y2));
		rtn.add(new CoordinateImpl(anchorX, anchorY));

		return rtn;
	}

	public static Shape createReactionBox(Coordinate boxCentre, String symbol) {
		Coordinate topLeft = new CoordinateImpl(
				boxCentre.getX() - EDGE_TYPE_WIDGET_WIDTH / 2.0,
				boxCentre.getY() - EDGE_TYPE_WIDGET_WIDTH / 2.0
		);
		Coordinate bottomRight = new CoordinateImpl(
				topLeft.getX() + EDGE_TYPE_WIDGET_WIDTH,
				topLeft.getY() + EDGE_TYPE_WIDGET_WIDTH
		);
		return new BoxImpl(topLeft, bottomRight, Boolean.TRUE, symbol);
	}

	public static Shape createReactionCircle(Coordinate centre) {
		final double radius = EDGE_TYPE_WIDGET_WIDTH / 2.0d - CIRCLE_WIDGET_CORRECTION;
		return new CircleImpl(centre, radius, false, null);
	}

	public static Shape createReactionDoubleCircle(Coordinate centre) {
		final double radius = EDGE_TYPE_WIDGET_WIDTH / 2.0d - CIRCLE_WIDGET_CORRECTION;
		final double r1 = ShapeBuilder.EDGE_TYPE_WIDGET_WIDTH / 2.0d - 2 - CIRCLE_WIDGET_CORRECTION;
		return new DoubleCircleImpl(centre, radius, r1);
	}

	public static Shape createBox(Coordinate boxCentre, String symbol) {
		double width = -1;
		if (symbol != null) {
			width = measureText(symbol).getWidth();
		}
		if (width < EDGE_TYPE_WIDGET_WIDTH) {
			width = EDGE_TYPE_WIDGET_WIDTH;
		}
		Coordinate topLeft = new CoordinateImpl(
				boxCentre.getX() - width / 2.0,
				boxCentre.getY() - width / 2.0
		);
		Coordinate bottomRight = new CoordinateImpl(
				topLeft.getX() + width,
				topLeft.getY() + width
		);
		return new BoxImpl(topLeft, bottomRight, true, symbol);
	}

	public static Shape createNodeSummaryItem(Coordinate boxCentre, String label) {
		double width = -1;
		if (label != null) width = measureText(label).getWidth();
		if (width < EDGE_TYPE_WIDGET_WIDTH) width = EDGE_TYPE_WIDGET_WIDTH;
		return new CircleImpl(boxCentre, width / 2, true, label);
	}

	//TODO requires a bit work on the accuracy
	private static Rectangle2D measureText(String text) {
		//Create a dummy BufferedImage to get the Graphincs object
		BufferedImage image = new BufferedImage(1, 1, BufferedImage.TYPE_INT_ARGB);
		Graphics2D g2 = image.createGraphics();
		//Set the used font
		g2.setFont(new Font("Arial", Font.PLAIN, 8));
		Font font = g2.getFont();
		// get context from the graphics
		FontRenderContext context = g2.getFontRenderContext();
		return font.getStringBounds(text, context);
	}
}
