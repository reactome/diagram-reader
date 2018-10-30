package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;

public class StopImpl extends ShapeImpl {
	public StopImpl(Coordinate a, Coordinate b, Coordinate c) {
		setA(a);
		setB(b);
		setC(c);
		setType(Type.STOP);
	}
}
