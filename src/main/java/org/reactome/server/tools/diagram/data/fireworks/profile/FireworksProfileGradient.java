package org.reactome.server.tools.diagram.data.fireworks.profile;

import java.io.Serializable;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface FireworksProfileGradient extends Serializable {

    String getMin();

    String getStop();

    String getMax();
}
