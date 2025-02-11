package org.reactome.server.tools.diagram.data.profile.analysis;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
public interface OverlayNode {

    ProfileGradient getGradient();

    String getText();

    OverlayLegend getLegend();
}
