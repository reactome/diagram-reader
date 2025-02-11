package org.reactome.server.tools.diagram.data.profile.diagram;

import java.io.Serializable;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 * @author Kostas Sidiropoulos (ksidiro@ebi.ac.uk)
 */
public interface DiagramProfile extends Serializable {

    String getName();

    DiagramProfileProperties getProperties();

    DiagramProfileNode getCell();

    DiagramProfileNode getCellNucleus();

    DiagramProfileNode getAttachment();

    DiagramProfileNode getChemical();

    DiagramProfileNode getChemicaldrug();

    DiagramProfileNode getCompartment();

    DiagramProfileNode getComplex();

    DiagramProfileNode getComplexdrug();

    DiagramProfileNode getEntity();

    DiagramProfileNode getEntityset();

    DiagramProfileNode getEntitysetdrug();

    DiagramProfileNode getFlowline();

    DiagramProfileNode getGene();

    DiagramProfileNode getNote();

    DiagramProfileNode getInteractor();

    DiagramProfileNode getLink();

    DiagramProfileNode getOtherentity();

    DiagramProfileNode getProcessnode();

    DiagramProfileNode getEncapsulatednode();

    DiagramProfileNode getProtein();

    DiagramProfileNode getProteindrug();

    DiagramProfileNode getReaction();

    DiagramProfileNode getRna();

    DiagramProfileNode getRnadrug();

    DiagramProfileNode getStoichiometry();

    DiagramProfileThumbnail getThumbnail();

}
