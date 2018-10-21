package org.reactome.server.tools.diagram.data.layout.impl;

import org.reactome.server.tools.diagram.data.layout.Identifier;

public class IdentifierImpl implements Identifier {

	private String resource;
	private String id;

	public IdentifierImpl() {
	}

	public IdentifierImpl(String resource, String id) {
		this.resource = resource;
		this.id = id;
	}

	@Override
	public String getResource() {
		return resource;
	}

	public void setResource(String resource) {
		this.resource = resource;
	}

	@Override
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
