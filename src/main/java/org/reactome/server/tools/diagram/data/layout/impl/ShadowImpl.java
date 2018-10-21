package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;
import org.reactome.server.tools.diagram.data.layout.NodeProperties;
import org.reactome.server.tools.diagram.data.layout.Shadow;

import java.util.List;

public class ShadowImpl extends DiagramObjectImpl implements Shadow {

	private NodeProperties prop;
	private List<Coordinate> points;
	private String colour;

	public ShadowImpl() {
	}

	public ShadowImpl(NodeProperties prop, List<Coordinate> points, String colour) {
		this.prop = prop;
		this.points = points;
		this.colour = colour;
	}

	@Override
	public NodeProperties getProp() {
		return prop;
	}

	public void setProp(NodeProperties prop) {
		this.prop = prop;
	}

	@Override
	public List<Coordinate> getPoints() {
		return points;
	}

	public void setPoints(List<Coordinate> points) {
		this.points = points;
	}

	@Override
	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}
}
