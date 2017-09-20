package org.reactome.server.tools.diagram.data.profile.analysis;

import java.io.Serializable;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface ProfileGradient extends Serializable {

    String getMin();

    String getStop();

    String getMax();

}
