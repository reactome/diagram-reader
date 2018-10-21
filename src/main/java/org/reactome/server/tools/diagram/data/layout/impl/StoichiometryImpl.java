package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Shape;
import org.reactome.server.tools.diagram.data.layout.Stoichiometry;

public class StoichiometryImpl implements Stoichiometry {
	private Integer value;
	private Shape shape;

	public StoichiometryImpl() {
	}

	public StoichiometryImpl(Integer value, Shape shape) {
		this.value = value;
		this.shape = shape;
	}

	@Override
	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
}
