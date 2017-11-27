package org.reactome.server.tools.diagram.data.fireworks.profile;

import java.io.Serializable;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface FireworksProfile extends Serializable {

    String getName();

    FireworksProfileColour getNode();

    FireworksProfileColour getEdge();

    FireworksProfileColour getThumbnail();

}
