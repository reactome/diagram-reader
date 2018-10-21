package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;
import org.reactome.server.tools.diagram.data.layout.Shape;

public class ShapeImpl implements Shape {

	private Coordinate a;
	private Coordinate b;
	private Coordinate c;
	private Double r;
	private Double r1;
	private String s;
	private String type;
	private Boolean empty;

	public ShapeImpl() {
	}

	@Override
	public Coordinate getA() {
		return a;
	}

	public void setA(Coordinate a) {
		this.a = a;
	}

	@Override
	public Coordinate getB() {
		return b;
	}

	public void setB(Coordinate b) {
		this.b = b;
	}

	@Override
	public Coordinate getC() {
		return c;
	}

	public void setC(Coordinate c) {
		this.c = c;
	}

	@Override
	public Double getR() {
		return r;
	}

	public void setR(Double r) {
		this.r = r;
	}

	@Override
	public Double getR1() {
		return r1;
	}

	public void setR1(Double r1) {
		this.r1 = r1;
	}

	@Override
	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	@Override
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Boolean getEmpty() {
		return empty;
	}

	public void setEmpty(Boolean empty) {
		this.empty = empty;
	}
}
