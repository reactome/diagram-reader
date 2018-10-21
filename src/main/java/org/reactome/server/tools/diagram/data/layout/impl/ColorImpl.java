package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Color;

public class ColorImpl implements Color {

	private Integer r;
	private Integer g;
	private Integer b;

	public ColorImpl() {
	}

	public ColorImpl(Integer r, Integer g, Integer b) {
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public Integer getR() {
		return r;
	}

	public void setR(Integer r) {
		this.r = r;
	}

	@Override
	public Integer getG() {
		return g;
	}

	public void setG(Integer g) {
		this.g = g;
	}

	@Override
	public Integer getB() {
		return b;
	}

	public void setB(Integer b) {
		this.b = b;
	}
}
