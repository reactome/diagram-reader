package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.NodeProperties;

public class NodePropertiesImpl implements NodeProperties {

	private Double x;
	private Double y;
	private Double width;
	private Double height;

	public NodePropertiesImpl() {
	}

	public NodePropertiesImpl(Double x, Double y, Double width, Double height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}

	public void setX(Double x) {
		this.x = x;
	}

	public void setY(Double y) {
		this.y = y;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public void setHeight(Double height) {
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
