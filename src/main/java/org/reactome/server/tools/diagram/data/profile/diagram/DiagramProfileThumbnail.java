package org.reactome.server.tools.diagram.data.profile.diagram;

import java.io.Serializable;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 * @author Kostas Sidiropoulos (ksidiro@ebi.ac.uk)
 */
public interface DiagramProfileThumbnail extends Serializable {

    String getNode();

    String getEdge();

    String getHovering();

    String getHighlight();

    String getSelection();
}
