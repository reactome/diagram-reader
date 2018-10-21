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

	@Override
	public Long getId() {
		return id;
	}

	@Override
	public Long getReactomeId() {
		return reactomeId;
	}

	@Override
	public String getDisplayName() {
		return displayName;
	}

	@Override
	public String getSchemaClass() {
		return schemaClass;
	}

	@Override
	public String getRenderableClass() {
		return renderableClass;
	}

	@Override
	public Coordinate getPosition() {
		return position;
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

	@Override
	public Double getMinY() {
		return minY;
	}

	@Override
	public Double getMaxX() {
		return maxX;
	}

	@Override
	public Double getMaxY() {
		return maxY;
	}
}
