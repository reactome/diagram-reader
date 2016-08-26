package org.reactome.server.tools.diagram.data.layout;

import java.util.List;

/**
 * @author Kostas Sidiropoulos (ksidiro@ebi.ac.uk)
 */
public interface ReactionPart {

    Long getId();

    List<Coordinate> getPoints();

    Integer getStoichiometry();

}
