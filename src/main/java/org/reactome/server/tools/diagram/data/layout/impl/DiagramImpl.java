package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.*;

import java.util.List;

public class DiagramImpl implements Diagram {

	private Boolean isDisease;
	private Boolean forNormalDraw;
	private String displayName;
	private List<Node> nodes;
	private List<Note> notes;
	private List<Edge> edges;
	private List<Compartment> compartments;
	private List<Shadow> shadows;
	private Long dbId;
	private String stableId;
	private Integer minX;
	private Integer maxX;
	private Integer minY;
	private Integer maxY;
	private String cPicture;

	@Override
	public Boolean getIsDisease() {
		return isDisease;
	}

	@Override
	public Boolean getForNormalDraw() {
		return forNormalDraw;
	}

	public void setForNormalDraw(Boolean forNormalDraw) {
		this.forNormalDraw = forNormalDraw;
	}

	@Override
	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public List<Node> getNodes() {
		return nodes;
	}

	public void setNodes(List<Node> nodes) {
		this.nodes = nodes;
	}

	@Override
	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	@Override
	public List<Edge> getEdges() {
		return edges;
	}

	public void setEdges(List<Edge> edges) {
		this.edges = edges;
	}

	@Override
	public List<Link> getLinks() {
		return null;
	}

	@Override
	public List<Compartment> getCompartments() {
		return compartments;
	}

	public void setCompartments(List<Compartment> compartments) {
		this.compartments = compartments;
	}

	@Override
	public List<Shadow> getShadows() {
		return shadows;
	}

	public void setShadows(List<Shadow> shadows) {
		this.shadows = shadows;
	}

	@Override
	public Long getDbId() {
		return dbId;
	}

	public void setDbId(Long dbId) {
		this.dbId = dbId;
	}

	@Override
	public String getStableId() {
		return stableId;
	}

	public void setStableId(String stableId) {
		this.stableId = stableId;
	}

	@Override
	public Integer getMinX() {
		return minX;
	}

	public void setMinX(Integer minX) {
		this.minX = minX;
	}

	@Override
	public Integer getMaxX() {
		return maxX;
	}

	public void setMaxX(Integer maxX) {
		this.maxX = maxX;
	}

	@Override
	public Integer getMinY() {
		return minY;
	}

	public void setMinY(Integer minY) {
		this.minY = minY;
	}

	@Override
	public Integer getMaxY() {
		return maxY;
	}

	public void setMaxY(Integer maxY) {
		this.maxY = maxY;
	}

	@Override
	public String getCPicture() {
		return cPicture;
	}

	public void setDisease(Boolean disease) {
		isDisease = disease;
	}

	public void setcPicture(String cPicture) {
		this.cPicture = cPicture;
	}
}
