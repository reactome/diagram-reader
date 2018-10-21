package org.reactome.server.tools.diagram.data.graph.impl;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.reactome.server.tools.diagram.data.graph.EntityNode;
import org.reactome.server.tools.diagram.data.graph.EventNode;
import org.reactome.server.tools.diagram.data.graph.Graph;
import org.reactome.server.tools.diagram.data.graph.SubpathwayNode;

import java.util.ArrayList;
import java.util.List;

public class GraphImpl implements Graph {

    private Long dbId;
    private String stId;
    private String displayName;
    private String speciesName;
    private List<EntityNode> nodes;
    private List<EventNode> edges;
    private List<SubpathwayNode> subpathways;

    public GraphImpl(Long dbId, String stId, String displayName, String speciesName, List<EntityNode> nodes, List<EventNode> edges, List<SubpathwayNode> subpathways) {
        this.dbId = dbId;
        this.stId = stId;
        this.displayName = displayName;
        this.speciesName = speciesName;
        this.nodes = nodes;
        this.edges = edges;
        this.subpathways = subpathways;
    }

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
    public String getSpeciesName() {
        return speciesName;
    }

    @Override
    public List<EntityNode> getNodes() {
        return nodes;
    }

    public void setNodes(List<EntityNodeImpl> entityNodes) {
        this.nodes = new ArrayList<>(entityNodes);
    }

    @Override
    public List<EventNode> getEdges() {
        return edges;
    }

    public void setEdges(List<EventNodeImpl> edges) {
        this.edges = new ArrayList<>(edges);
    }

    @Override
    public List<SubpathwayNode> getSubpathways() {
        return subpathways;
    }

    public void setSubpathways(List<SubpathwayNodeImpl> subpathways) {
        this.subpathways = new ArrayList<>(subpathways);
    }
}
