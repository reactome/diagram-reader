package org.reactome.server.tools.diagram.data.profile.interactors;

import java.io.Serializable;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
public interface InteractorProfileNode extends Serializable {

    String getFill();

    String getStroke();

    String getLighterFill();

    String getLighterStroke();

    String getText();

    String getLighterText();
}
