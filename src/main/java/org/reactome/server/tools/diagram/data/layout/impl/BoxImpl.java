package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;

public class BoxImpl extends ShapeImpl {

	public BoxImpl(Coordinate a, Coordinate b, Boolean empty, String s) {
		setA(a);
		setB(b);
		setS(s);
		setEmpty(empty);
		setType(Type.BOX);
	}
}
