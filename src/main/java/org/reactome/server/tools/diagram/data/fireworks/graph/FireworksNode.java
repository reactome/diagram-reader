package org.reactome.server.tools.diagram.data.fireworks.graph;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface FireworksNode {

    Long getDbId();

    String getStId();

    String getName();

    Double getRatio();

    Double getAngle();

    Double getX();

    Double getY();
}
