package org.reactome.server.tools.diagram.data.layout.impl;

public class CircleImpl extends ShapeImpl {

	public CircleImpl(CoordinateImpl c, Double r, Boolean empty) {
		setC(c);
		setR(r);
		setEmpty(empty);
		setType("CIRCLE");
	}
}
