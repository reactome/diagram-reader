package org.reactome.server.tools.diagram.data.layout;



import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * @author Kostas Sidiropoulos (ksidiro@ebi.ac.uk)
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public interface Connector {

    Long getEdgeId();

    Boolean getIsDisease();

    String getType();

    Boolean getIsFadeOut();

    List<Segment> getSegments();

    Shape getEndShape();

    Stoichiometry getStoichiometry();
}
