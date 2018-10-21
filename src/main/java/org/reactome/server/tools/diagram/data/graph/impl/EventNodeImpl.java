package org.reactome.server.tools.diagram.data.graph.impl;

import org.reactome.server.tools.diagram.data.graph.EventNode;
import org.reactome.server.tools.diagram.data.graph.base.RegulationBase;

import java.util.ArrayList;
import java.util.List;

public class EventNodeImpl implements EventNode {

    private List<Long> preceding;
    private List<Long> following;
    private List<Long> inputs;
    private List<Long> outputs;
    private List<Long> catalysts;
    private List<Long> inhibitors = new ArrayList<>();
    private List<Long> activators = new ArrayList<>();
    private List<Long> requirements = new ArrayList<>();
    private List<Long> diagramIds;
    private List<Long> efs;
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
    public List<Long> getEntityFunctionalStatus() {
        return efs;
    }

    @Override
    public List<Long> getRequirements() {
        return requirements;
    }

    public void setRegulations(List<RegulationBase> regulations) {
        for (RegulationBase regulation : regulations) {
            String type = regulation.getType().toLowerCase();
            if (type.startsWith("negative")) {
                inhibitors.add(regulation.getDbId());
            } else if (type.startsWith("positive")) {
                activators.add(regulation.getDbId());
            } else {
                requirements.add(regulation.getDbId());
            }
        }
    }

    @Override
    public List<Long> getDiagramIds() {
        return diagramIds;
    }

    public void setDiagramIds(List<Long> diagramIds) {
        this.diagramIds = diagramIds;
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
