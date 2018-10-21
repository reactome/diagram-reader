package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Connector;
import org.reactome.server.tools.diagram.data.layout.Node;
import org.reactome.server.tools.diagram.data.layout.NodeAttachment;
import org.reactome.server.tools.diagram.data.layout.SummaryItem;

import java.util.List;

public class NodeImpl extends NodeCommonImpl implements Node {

	private List<NodeAttachment> nodeAttachments;
	private List<Connector> connectors;
	private Boolean trivial;
	private SummaryItem interactorsSummary;

	@Override
	public List<NodeAttachment> getNodeAttachments() {
		return nodeAttachments;
	}

	public void setNodeAttachments(List<NodeAttachment> nodeAttachments) {
		this.nodeAttachments = nodeAttachments;
	}

	@Override
	public List<Connector> getConnectors() {
		return connectors;
	}

	public void setConnectors(List<Connector> connectors) {
		this.connectors = connectors;
	}

	@Override
	public Boolean getTrivial() {
		return trivial;
	}

	public void setTrivial(Boolean trivial) {
		this.trivial = trivial;
	}

	@Override
	public SummaryItem getInteractorsSummary() {
		return interactorsSummary;
	}

	public void setInteractorsSummary(SummaryItem interactorsSummary) {
		this.interactorsSummary = interactorsSummary;
	}
}
