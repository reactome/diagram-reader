package org.reactome.server.tools.diagram.data.layout.impl;

public class StopImpl extends ShapeImpl {
	public StopImpl(CoordinateImpl a, CoordinateImpl b) {
		setA(a);
		setB(b);
		setType("STOP");
	}
}
