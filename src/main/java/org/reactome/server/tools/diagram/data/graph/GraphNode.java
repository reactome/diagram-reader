package org.reactome.server.tools.diagram.data.graph;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface GraphNode {

    Long getDbId();

    String getStId();

    String getDisplayName();

    String getSchemaClass();

    Long getSpeciesID();

}
