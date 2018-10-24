package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.*;

import java.util.List;

public class ConnectorImpl implements Connector {

	private Long edgeId;
	private Boolean isDisease;
	private ConnectorType type;
	private Boolean isFadeOut;
	private List<Segment> segments;
	private Shape endShape;
	private Stoichiometry stoichiometry;

	public ConnectorImpl() {
	}

	@Override
	public Long getEdgeId() {
		return edgeId;
	}

	public void setEdgeId(Long edgeId) {
		this.edgeId = edgeId;
	}

	@Override
	public Boolean getIsDisease() {
		return isDisease;
	}

	public void setDisease(Boolean disease) {
		isDisease = disease;
	}

	public void setFadeOut(Boolean fadeOut) {
		isFadeOut = fadeOut;
	}

	@Override
	public String getType() {
		return type.name();
	}

	public void setType(String type) {
		this.type = ConnectorType.valueOf(type);
	}

	@Override
	public Boolean getIsFadeOut() {
		return isFadeOut;
	}

	@Override
	public List<Segment> getSegments() {
		return segments;
	}

	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}

	@Override
	public Shape getEndShape() {
		return endShape;
	}

	public void setEndShape(Shape endShape) {
		this.endShape = endShape;
	}

	@Override
	public Stoichiometry getStoichiometry() {
		return stoichiometry;
	}

	public void setStoichiometry(Stoichiometry stoichiometry) {
		this.stoichiometry = stoichiometry;
	}

	public void setPointer(ConnectorType connectorType){
		this.type = connectorType;
		if(segments.size() > 0){
			Segment segment;
			List<Coordinate> points;
			switch (connectorType){
				case INPUT:
					return;
				case OUTPUT:
					// Use the first segment of the Connector - closer to the node
					// IMPORTANT!!! Segments start from the node and point to the backbone
					segment = segments.get(0);
					points = ShapeBuilder.createArrow(
							segment.getFrom().getX(),
							segment.getFrom().getY(),
							segment.getTo().getX(),
							segment.getTo().getY());
					// Shape is a filled arrow
					this.endShape = new ArrowImpl(points.get(0), points.get(1), points.get(2), Boolean.FALSE);
					break;
				case CATALYST:
					// Use the last segment of the Connector - closer to the edge (reaction)
					segment = segments.get(segments.size() - 1);
					// Adjust the position of the segment to have a distance from the reaction position
					double radius = (ShapeBuilder.EDGE_MODULATION_WIDGET_WIDTH / 2.0d);
					Coordinate centre =  calculateEndpoint(segment, getDistanceForEndpoint(type));
					segments.remove(segment);
					segments.add(new SegmentImpl(segment.getFrom(), calculateEndpoint(segment, getDistanceForEndpoint(type, radius))));
					// Shape is an empty circle
					this.endShape = new CircleImpl(centre, radius, true, null);
					break;
				case INHIBITOR:
					// Use the last segment of the Connector - closer to the edge (reaction)
					segment = segments.get(segments.size() - 1);
					// Adjust the position of the segment to have a distance from the reaction position
					segments.remove(segment);
					segment = new SegmentImpl(segment.getFrom(), calculateEndpoint(segment, getDistanceForEndpoint(type)));
					segments.add(segment);
					points = ShapeBuilder.createStop(
							segment.getTo().getX(),
							segment.getTo().getY(),
							segment.getFrom().getX(),
							segment.getFrom().getY());
					// Shape is a stop sign
					this.endShape = new StopImpl(points.get(0), points.get(1));
					break;
				case ACTIVATOR:
					// Use the last segment of the Connector - closer to the edge (reaction)
					segment = segments.get(segments.size() - 1);
//					segments.remove(segment);
//					segment = new SegmentImpl(segment.getFrom(), calculateEndpoint(segment, getDistanceForEndpoint(type)));
//					segments.add(segment);
					points = ShapeBuilder.createArrow(
							segment.getTo().getX(),
							segment.getTo().getY(),
							segment.getFrom().getX(),
							segment.getFrom().getY());
					// Shape is an empty arrow
					this.endShape = new ArrowImpl(points.get(0), points.get(1), points.get(2), Boolean.TRUE);
					break;
			}
		}
	}

	/**
	 * Calculates the end point on the segment
	 */
	public Coordinate calculateEndpoint(Segment segment, double dist){
		// Point used to calculate the angle of the segment
		double controlX = segment.getFrom().getX();
		double controlY = segment.getFrom().getY();
		// Point to replace
		double oldX = segment.getTo().getX();
		double oldY = segment.getTo().getY();

		// Remember: the y axis is contrary to the ordinary coordinate system
		double tan = (controlY - oldY) / (controlX - oldX);
		double theta = Math.atan(tan);
		if (controlX - oldX < 0)
			theta +=  Math.PI;
		double x = oldX + dist * Math.cos(theta);
		double y = oldY + dist * Math.sin(theta);

		return new CoordinateImpl(x, y);
	}

	private double getDistanceForEndpoint(ConnectorType connectRole) {
		return getDistanceForEndpoint(connectRole, 0);
	}

	private double getDistanceForEndpoint(ConnectorType connectRole, double radius) {
		if (connectRole == ConnectorType.CATALYST) {
			return (ShapeBuilder.EDGE_TYPE_WIDGET_WIDTH + ShapeBuilder.EDGE_MODULATION_WIDGET_WIDTH) * 0.6 + radius;
		}else {
			return ShapeBuilder.EDGE_TYPE_WIDGET_WIDTH * 0.75;
		}
	}}
