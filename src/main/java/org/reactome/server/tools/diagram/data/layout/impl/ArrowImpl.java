package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;

public class ArrowImpl extends ShapeImpl {

	public ArrowImpl(Coordinate a, Coordinate b, Coordinate c, Boolean empty) {
		setA(a);
		setB(b);
		setC(c);
		setType("ARROW");
		setEmpty(empty);
	}
}
