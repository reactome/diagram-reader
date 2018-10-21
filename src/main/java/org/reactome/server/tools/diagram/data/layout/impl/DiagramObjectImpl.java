package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.ContextMenuTrigger;
import org.reactome.server.tools.diagram.data.layout.Coordinate;
import org.reactome.server.tools.diagram.data.layout.DiagramObject;

public class DiagramObjectImpl implements DiagramObject {
	private Long id;
	private Long reactomeId;
	private String displayName;
	private String schemaClass;
	private String renderableClass;
	private Coordinate position;
	private Boolean isDisease;
	private Boolean isFadeOut;
	private ContextMenuTrigger contextMenuTrigger;
	private Double minX;
	private Double minY;
	private Double maxX;
	private Double maxY;

	public void setDisease(Boolean disease) {
		isDisease = disease;
	}

	public void setFadeOut(Boolean fadeOut) {
		isFadeOut = fadeOut;
	}

	public void setContextMenuTrigger(ContextMenuTrigger contextMenuTrigger) {
		this.contextMenuTrigger = contextMenuTrigger;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public Long getReactomeId() {
		return reactomeId;
	}

	public void setReactomeId(Long reactomeId) {
		this.reactomeId = reactomeId;
	}

	@Override
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String getSchemaClass() {
		return schemaClass;
	}

	public void setSchemaClass(String schemaClass) {
		this.schemaClass = schemaClass;
	}

	@Override
	public String getRenderableClass() {
		return renderableClass;
	}

	public void setRenderableClass(String renderableClass) {
		this.renderableClass = renderableClass;
	}

	@Override
	public Coordinate getPosition() {
		return position;
	}

	public void setPosition(Coordinate position) {
		this.position = position;
	}

	@Override
	public Boolean getIsDisease() {
		return isDisease;
	}

	@Override
	public Boolean getIsFadeOut() {
		return isFadeOut;
	}

	@Override
	public ContextMenuTrigger contextMenuTrigger() {
		return contextMenuTrigger;
	}

	@Override
	public Double getMinX() {
		return minX;
	}

	public void setMinX(Double minX) {
		this.minX = minX;
	}

	@Override
	public Double getMinY() {
		return minY;
	}

	public void setMinY(Double minY) {
		this.minY = minY;
	}

	@Override
	public Double getMaxX() {
		return maxX;
	}

	public void setMaxX(Double maxX) {
		this.maxX = maxX;
	}

	@Override
	public Double getMaxY() {
		return maxY;
	}

	public void setMaxY(Double maxY) {
		this.maxY = maxY;
	}
}
