package org.reactome.server.tools.diagram.data.layout;

import uk.ac.ebi.pwp.structures.quadtree.client.QuadTreeBox;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public interface DiagramObject extends QuadTreeBox {

    Long getId(); //unique per diagram

    Long getReactomeId();

    String getDisplayName();

    String getSchemaClass();

    String getRenderableClass();

    Coordinate getPosition();

    Boolean getIsDisease();

    Boolean getIsFadeOut();

//    <T extends GraphObject> T getGraphObject();
//
//    void setGraphObject(GraphObject obj);

    //Don use get -> getContextMenuTrigger (because AutoBean only overrides the non-property methods)
    ContextMenuTrigger contextMenuTrigger(); //Behaviour override with DiagramObjectCategory

}
