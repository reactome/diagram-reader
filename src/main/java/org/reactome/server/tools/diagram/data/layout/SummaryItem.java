package org.reactome.server.tools.diagram.data.layout;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface SummaryItem {

    String getType();

    Shape getShape();

    Boolean getPressed();

    void setPressed(Boolean pressed);

    Integer getNumber();

    void setNumber(Integer number);

    void setHit(Boolean hit);

    Boolean getHit();
}
