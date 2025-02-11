package org.reactome.server.tools.diagram.data.layout;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface Bound {

    Double getX();

    Double getY();

    Double getWidth();

    Double getHeight();

}
