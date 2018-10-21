package org.reactome.server.tools.diagram.data.graph.impl;

import org.reactome.server.tools.diagram.data.graph.SubpathwayNode;

import java.util.List;

public class SubpathwayNodeImpl implements SubpathwayNode {

    private Long dbId;
    private String stId;
    private String displayName;
    private List<Long> events;

    @Override
    public Long getDbId() {
        return dbId;
    }

    @Override
    public String getStId() {
        return stId;
    }

    @Override
    public String getDisplayName() {
        return displayName;
    }

    @Override
    public List<Long> getEvents() {
        return events;
    }
}
