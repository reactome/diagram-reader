package org.reactome.server.tools.diagram.data.fireworks.profile;

import java.io.Serializable;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface FireworksProfileColour extends Serializable {

    String getInitial();

    String getHighlight();

    String getSelection();

    String getFlag();

    String getFadeout();

    String getHit();

    FireworksProfileGradient getEnrichment();

    FireworksProfileGradient getExpression();
}
