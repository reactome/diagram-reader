package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Coordinate;
import org.reactome.server.tools.diagram.data.layout.Segment;

public class SegmentImpl implements Segment {
	private Coordinate from;
	private Coordinate to;

	public SegmentImpl() {
	}

	public SegmentImpl(Coordinate from, Coordinate to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public Coordinate getFrom() {
		return from;
	}

	public void setFrom(Coordinate from) {
		this.from = from;
	}

	@Override
	public Coordinate getTo() {
		return to;
	}

	public void setTo(Coordinate to) {
		this.to = to;
	}
}
