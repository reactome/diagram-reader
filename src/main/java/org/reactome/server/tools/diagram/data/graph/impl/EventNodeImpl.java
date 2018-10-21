package org.reactome.server.tools.diagram.data.graph.impl;

import org.reactome.server.tools.diagram.data.graph.EventNode;

import java.util.List;

public class EventNodeImpl implements EventNode {

    private List<Long> preceding;
    private List<Long> following;
    private List<Long> inputs;
    private List<Long> outputs;
    private List<Long> catalysts;
    private List<Long> inhibitors;
    private List<Long> activators;
    private List<Long> requirements;
    private List<Long> diagramIds;
    private Long dbId;
    private String stId;
    private String displayName;
    private String schemaClass;
    private Long speciesId;

    @Override
    public List<Long> getPreceding() {
        return preceding;
    }

    @Override
    public List<Long> getFollowing() {
        return following;
    }

    @Override
    public List<Long> getInputs() {
        return inputs;
    }

    @Override
    public List<Long> getOutputs() {
        return outputs;
    }

    @Override
    public List<Long> getCatalysts() {
        return catalysts;
    }

    @Override
    public List<Long> getInhibitors() {
        return inhibitors;
    }

    @Override
    public List<Long> getActivators() {
        return activators;
    }

    @Override
    public List<Long> getRequirements() {
        return requirements;
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
        return speciesId;
    }
}
