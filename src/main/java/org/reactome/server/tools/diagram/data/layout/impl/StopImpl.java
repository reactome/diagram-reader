package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;

public class StopImpl extends ShapeImpl {
	public StopImpl(Coordinate a, Coordinate b) {
		setA(a);
		setB(b);
		setType(Type.STOP);
	}
}
