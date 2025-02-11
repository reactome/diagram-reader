package org.reactome.server.tools.diagram.data.layout;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface DiagramObject {

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

    Double getMinX();

    Double getMinY();

    Double getMaxX();

    Double getMaxY();
}
