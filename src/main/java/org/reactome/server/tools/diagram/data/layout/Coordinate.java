package org.reactome.server.tools.diagram.data.layout;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.reactome.server.tools.diagram.data.layout.impl.CoordinateFactory;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
// This is required so that we can use the non setter/getter methods e.g. minus().
// With this annotation every Coordinate gets deserialised as CoordinateFactory
@JsonDeserialize(as=CoordinateFactory.class)
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface Coordinate {

    Double getX();

    Double getY();

    Coordinate add(Coordinate value);

    Coordinate divide(double factor);

    Coordinate minus(Coordinate value);

    Coordinate multiply(double factor);

    Coordinate transform(double factor, Coordinate delta);

}