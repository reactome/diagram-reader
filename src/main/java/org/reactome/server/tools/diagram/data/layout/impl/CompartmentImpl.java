package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Compartment;

import java.util.List;

public class CompartmentImpl extends NodeCommonImpl implements Compartment {
	private List<Long> ids;

	public CompartmentImpl() {
	}

	public CompartmentImpl(List<Long> ids) {
		this.ids = ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	@Override
	public List<Long> getComponentIds() {
		return ids;
	}
}
