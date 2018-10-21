package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Shape;
import org.reactome.server.tools.diagram.data.layout.SummaryItem;

public class SummaryItemImpl implements SummaryItem {

	private String type;
	private Shape shape;
	private Boolean pressed;
	private Integer number;
	private Boolean hit;

	public SummaryItemImpl() {
	}

	public SummaryItemImpl(String type, Shape shape, Boolean pressed, Integer number, Boolean hit) {
		this.type = type;
		this.shape = shape;
		this.pressed = pressed;
		this.number = number;
		this.hit = hit;
	}

	@Override
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}

	@Override
	public Boolean getPressed() {
		return pressed;
	}

	@Override
	public void setPressed(Boolean pressed) {
		this.pressed = pressed;
	}

	@Override
	public Integer getNumber() {
		return number;
	}

	@Override
	public void setNumber(Integer number) {
		this.number = number;

	}

	@Override
	public Boolean getHit() {
		return hit;
	}

	@Override
	public void setHit(Boolean hit) {
		this.hit = hit;
	}
}
