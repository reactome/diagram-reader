package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Connector;
import org.reactome.server.tools.diagram.data.layout.Segment;
import org.reactome.server.tools.diagram.data.layout.Shape;
import org.reactome.server.tools.diagram.data.layout.Stoichiometry;

import java.util.List;

public class ConnectorImpl implements Connector {

	private Long edgeId;
	private Boolean isDisease;
	private String type;
	private Boolean isFadeOut;
	private List<Segment> segments;
	private Shape endShape;
	private Stoichiometry stoichiometry;

	public ConnectorImpl() {
	}

	@Override
	public Long getEdgeId() {
		return edgeId;
	}

	public void setEdgeId(Long edgeId) {
		this.edgeId = edgeId;
	}

	@Override
	public Boolean getIsDisease() {
		return isDisease;
	}

	public void setDisease(Boolean disease) {
		isDisease = disease;
	}

	public void setFadeOut(Boolean fadeOut) {
		isFadeOut = fadeOut;
	}

	@Override
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public Boolean getIsFadeOut() {
		return isFadeOut;
	}

	@Override
	public List<Segment> getSegments() {
		return segments;
	}

	public void setSegments(List<Segment> segments) {
		this.segments = segments;
	}

	@Override
	public Shape getEndShape() {
		return endShape;
	}

	public void setEndShape(Shape endShape) {
		this.endShape = endShape;
	}

	@Override
	public Stoichiometry getStoichiometry() {
		return stoichiometry;
	}

	public void setStoichiometry(Stoichiometry stoichiometry) {
		this.stoichiometry = stoichiometry;
	}
}
