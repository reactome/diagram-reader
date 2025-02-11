package org.reactome.server.tools.diagram.data.graph;

import java.util.List;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
public interface EventNode extends GraphNode {

    List<Long> getPreceding();

    List<Long> getFollowing();

    List<Long> getInputs();

    List<Long> getOutputs();

    List<Long> getCatalysts();

    List<Long> getInhibitors();

    List<Long> getActivators();

    List<Long> getEntityFunctionalStatus();

    List<Long> getRequirements();

    List<Long> getDiagramIds();

}