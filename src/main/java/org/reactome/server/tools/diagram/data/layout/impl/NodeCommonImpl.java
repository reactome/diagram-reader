package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.*;

public class NodeCommonImpl extends DiagramObjectImpl implements NodeCommon {

	private NodeProperties prop;
	private NodeProperties innerProp;
	private Identifier identifier;
	private Coordinate textPosition;
	private Bound insets;
	private Color bgColor;
	private Color fgColor;
	private Boolean isCrossed;
	private Boolean needDashBorder;

	public void setCrossed(Boolean crossed) {
		isCrossed = crossed;
	}

	public void setNeedDashBorder(Boolean needDashBorder) {
		this.needDashBorder = needDashBorder;
	}

	@Override
	public NodeProperties getProp() {
		return prop;
	}

	public void setProp(NodeProperties prop) {
		this.prop = prop;
	}

	@Override
	public NodeProperties getInnerProp() {
		return innerProp;
	}

	public void setInnerProp(NodeProperties innerProp) {
		this.innerProp = innerProp;
	}

	@Override
	public Identifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Identifier identifier) {
		this.identifier = identifier;
	}

	@Override
	public Coordinate getTextPosition() {
		return textPosition;
	}

	public void setTextPosition(Coordinate textPosition) {
		this.textPosition = textPosition;
	}

	@Override
	public Bound getInsets() {
		return insets;
	}

	public void setInsets(Bound insets) {
		this.insets = insets;
	}

	@Override
	public Color getBgColor() {
		return bgColor;
	}

	public void setBgColor(Color bgColor) {
		this.bgColor = bgColor;
	}

	@Override
	public Color getFgColor() {
		return fgColor;
	}

	public void setFgColor(Color fgColor) {
		this.fgColor = fgColor;
	}

	@Override
	public Boolean getIsCrossed() {
		return isCrossed;
	}

	@Override
	public Boolean getNeedDashedBorder() {
		return needDashBorder;
	}
}
