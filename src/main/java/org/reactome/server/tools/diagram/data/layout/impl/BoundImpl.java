package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Bound;

public class BoundImpl implements Bound {

	private Double x;
	private Double y;
	private Double width;
	private Double height;

	public BoundImpl() {
	}

	public BoundImpl(Double x, Double y, Double width, Double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	@Override
	public Double getX() {
		return x;
	}

	@Override
	public Double getY() {
		return y;
	}

	@Override
	public Double getWidth() {
		return width;
	}

	@Override
	public Double getHeight() {
		return height;
	}
}
