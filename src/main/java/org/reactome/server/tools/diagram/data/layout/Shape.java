package org.reactome.server.tools.diagram.data.layout;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface Shape {

    Coordinate getA();

    Coordinate getB();

    Coordinate getC();

    Double getR();

    Double getR1();

    String getS();

    String getType();

    Boolean getEmpty();

}
