package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.NodeAttachment;
import org.reactome.server.tools.diagram.data.layout.Shape;

public class NodeAttachmentImpl implements NodeAttachment {

	private String label;
	private String description;
	private Long reactomeId;
	private Shape shape;

	public NodeAttachmentImpl() {
	}

	public NodeAttachmentImpl(String label, String description, Long reactomeId, Shape shape) {
		this.label = label;
		this.description = description;
		this.reactomeId = reactomeId;
		this.shape = shape;
	}

	@Override
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Long getReactomeId() {
		return reactomeId;
	}

	public void setReactomeId(Long reactomeId) {
		this.reactomeId = reactomeId;
	}

	@Override
	public Shape getShape() {
		return shape;
	}

	public void setShape(Shape shape) {
		this.shape = shape;
	}
}
