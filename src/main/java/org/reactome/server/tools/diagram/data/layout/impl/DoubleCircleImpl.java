package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;

public class DoubleCircleImpl extends ShapeImpl {

	public DoubleCircleImpl(Coordinate c, Double r, Double r1) {
		setC(c);
		setR(r);
		setR1(r1);
		setEmpty(true);
		setType(Type.DOUBLE_CIRCLE);
	}
}
