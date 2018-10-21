package org.reactome.server.tools.diagram.data.graph.impl;

import org.reactome.server.tools.diagram.data.graph.EntityNode;

import java.util.List;

public class EntityNodeImpl implements EntityNode {

    private List<Long> parents;
    private List<Long> children;
    private String identifier;
    private List<String> geneNames;
    private List<Long> diagramIds;
    private Long dbId;
    private String stId;
    private String displayName;
    private String schemaClass;
    private Long speciesID;

    @Override
    public List<Long> getParents() {
        return parents;
    }

    @Override
    public List<Long> getChildren() {
        return children;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public List<String> getGeneNames() {
        return geneNames;
    }

    @Override
    public List<Long> getDiagramIds() {
        return diagramIds;
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
    public String getSchemaClass() {
        return schemaClass;
    }

    @Override
    public Long getSpeciesID() {
        return speciesID;
    }
}
