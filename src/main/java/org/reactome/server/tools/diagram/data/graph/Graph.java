package org.reactome.server.tools.diagram.data.graph;

import java.util.List;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface Graph {

    Long getDbId();

    String getStId();

    List<EntityNode> getNodes();

    List<EventNode> getEdges();

    List<SubpathwayNode> getSubpathways();

}
