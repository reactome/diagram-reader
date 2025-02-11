package org.reactome.server.tools.diagram.data.graph;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface Graph {

    Long getDbId();

    String getStId();

    String getDisplayName();

    String getSpeciesName();

    List<EntityNode> getNodes();

    List<EventNode> getEdges();

    List<SubpathwayNode> getSubpathways();

}
