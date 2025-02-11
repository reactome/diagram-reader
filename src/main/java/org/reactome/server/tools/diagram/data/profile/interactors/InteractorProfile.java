package org.reactome.server.tools.diagram.data.profile.interactors;

import java.io.Serializable;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
public interface InteractorProfile extends Serializable {

    String getName();

    InteractorProfileNode getChemical();

    InteractorProfileNode getProtein();
}
