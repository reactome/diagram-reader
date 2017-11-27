package org.reactome.server.tools.diagram.data.fireworks;

import java.util.List;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface FireworksGraph {

    Long getSpeciesId();

    String getSpeciesName();

    List<FireworksNode> getNodes();

    List<FireworksEdge> getEdges();
}
