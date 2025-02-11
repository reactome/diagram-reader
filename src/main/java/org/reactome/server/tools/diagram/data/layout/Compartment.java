package org.reactome.server.tools.diagram.data.layout;

import java.util.List;

/**
 * @author Antonio Fabregat (fabregat@ebi.ac.uk)
 */
public interface Compartment extends NodeCommon {

    List<Long> getComponentIds();

}
