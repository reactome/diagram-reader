package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;


public class CircleImpl extends ShapeImpl {

	public CircleImpl(Coordinate c, Double r, Boolean empty, String s) {
		setC(c);
		setR(r);
		setEmpty(empty);
		setS(s);
		setType(Type.CIRCLE);
	}
}
