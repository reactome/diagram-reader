package org.reactome.server.tools.diagram.data.layout;

import java.util.List;

/**
 * @author Kostas Sidiropoulos (ksidiro@ebi.ac.uk)
 */
public interface Node extends NodeCommon {

    List<NodeAttachment> getNodeAttachments();

    List<Connector> getConnectors();

    Boolean getTrivial();

    SummaryItem getInteractorsSummary();

    //Keeping a pointer the the cached object improves performance avoiding searching for it every time it gets toggled

//    InteractorsSummary getDiagramEntityInteractorsSummary();

//    void setDiagramEntityInteractorsSummary(InteractorsSummary interactorsSummary);
}
