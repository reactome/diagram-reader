package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.EdgeCommon;
import org.reactome.server.tools.diagram.data.layout.ReactionPart;
import org.reactome.server.tools.diagram.data.layout.Segment;
import org.reactome.server.tools.diagram.data.layout.Shape;

import java.util.List;

public class EdgeCommonImpl extends DiagramObjectImpl implements EdgeCommon {

	private String reactionType;
	private String interactionType;
	private List<Segment> segments;
	private Shape endShape;
	private Shape reactionShape;
	private List<ReactionPart> inputs;
	private List<ReactionPart> outputs;
	private List<ReactionPart> catalysts;
	private List<ReactionPart> inhibitors;
	private List<ReactionPart> activators;
	private List<Long> precedingEvents;
	private List<Long> followingEvents;

	@Override
	public String getReactionType() {
		return reactionType;
	}

	@Override
	public String getInteractionType() {
		return interactionType;
	}

	@Override
	public List<Segment> getSegments() {
		return segments;
	}

	@Override
	public Shape getEndShape() {
		return endShape;
	}

	@Override
	public Shape getReactionShape() {
		return reactionShape;
	}

	@Override
	public List<ReactionPart> getInputs() {
		return inputs;
	}

	@Override
	public List<ReactionPart> getOutputs() {
		return outputs;
	}

	@Override
	public List<ReactionPart> getCatalysts() {
		return catalysts;
	}

	@Override
	public List<ReactionPart> getInhibitors() {
		return inhibitors;
	}

	@Override
	public List<ReactionPart> getActivators() {
		return activators;
	}

	@Override
	public List<Long> getPrecedingEvents() {
		return precedingEvents;
	}

	@Override
	public List<Long> getFollowingEvents() {
		return followingEvents;
	}
}
