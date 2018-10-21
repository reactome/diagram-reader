package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;
import org.reactome.server.tools.diagram.data.layout.ReactionPart;

import java.util.List;

public class ReactionPartImpl implements ReactionPart {
	private Long id;
	private List<Coordinate> points;
	private Integer stoichiometry;

	public ReactionPartImpl() {
	}

	public ReactionPartImpl(Long id, List<Coordinate> points, Integer stoichiometry) {
		this.id = id;
		this.points = points;
		this.stoichiometry = stoichiometry;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public List<Coordinate> getPoints() {
		return points;
	}

	public void setPoints(List<Coordinate> points) {
		this.points = points;
	}

	@Override
	public Integer getStoichiometry() {
		return stoichiometry;
	}

	public void setStoichiometry(Integer stoichiometry) {
		this.stoichiometry = stoichiometry;
	}
}
