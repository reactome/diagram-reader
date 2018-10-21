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

	public void setReactionType(String reactionType) {
		this.reactionType = reactionType;
	}

	@Override
	public String getInteractionType() {
		return interactionType;
	}

	public void setInteractionType(String interactionType) {
		this.interactionType = interactionType;
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
	public Shape getReactionShape() {
		return reactionShape;
	}

	public void setReactionShape(Shape reactionShape) {
		this.reactionShape = reactionShape;
	}

	@Override
	public List<ReactionPart> getInputs() {
		return inputs;
	}

	public void setInputs(List<ReactionPart> inputs) {
		this.inputs = inputs;
	}

	@Override
	public List<ReactionPart> getOutputs() {
		return outputs;
	}

	public void setOutputs(List<ReactionPart> outputs) {
		this.outputs = outputs;
	}

	@Override
	public List<ReactionPart> getCatalysts() {
		return catalysts;
	}

	public void setCatalysts(List<ReactionPart> catalysts) {
		this.catalysts = catalysts;
	}

	@Override
	public List<ReactionPart> getInhibitors() {
		return inhibitors;
	}

	public void setInhibitors(List<ReactionPart> inhibitors) {
		this.inhibitors = inhibitors;
	}

	@Override
	public List<ReactionPart> getActivators() {
		return activators;
	}

	public void setActivators(List<ReactionPart> activators) {
		this.activators = activators;
	}

	@Override
	public List<Long> getPrecedingEvents() {
		return precedingEvents;
	}

	public void setPrecedingEvents(List<Long> precedingEvents) {
		this.precedingEvents = precedingEvents;
	}

	@Override
	public List<Long> getFollowingEvents() {
		return followingEvents;
	}

	public void setFollowingEvents(List<Long> followingEvents) {
		this.followingEvents = followingEvents;
	}
}
