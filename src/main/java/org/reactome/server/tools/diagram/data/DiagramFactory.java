package org.reactome.server.tools.diagram.data;

import org.reactome.server.tools.diagram.data.exception.DeserializationException;
import org.reactome.server.tools.diagram.data.graph.Graph;
import org.reactome.server.tools.diagram.data.graph.factory.GraphObjectsFactory;
import org.reactome.server.tools.diagram.data.layout.Diagram;
import org.reactome.server.tools.diagram.data.layout.factory.DiagramObjectsFactory;

/**
 * @author Kostas Sidiropoulos <ksidiro@ebi.ac.uk>
 */
public abstract class DiagramFactory {

    public static Diagram getDiagram(String json) throws DeserializationException {
        return DiagramObjectsFactory.getObject(Diagram.class, json);
    }

    public static Graph getGraph(String json) throws DeserializationException {
        return GraphObjectsFactory.getObject(Graph.class, json);
    }
}
