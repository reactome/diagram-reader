package org.reactome.server.tools.diagram.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.reactome.server.tools.diagram.data.exception.DeserializationException;
import org.reactome.server.tools.diagram.data.graph.Graph;
import org.reactome.server.tools.diagram.data.layout.Diagram;
import org.reactome.server.tools.diagram.data.mapper.ObjectMapperProvider;
import org.reactome.server.tools.diagram.data.profile.diagram.DiagramProfile;
import org.reactome.server.tools.diagram.data.profile.analysis.AnalysisProfile;

/**
 * @author Kostas Sidiropoulos <ksidiro@ebi.ac.uk>
 */
public abstract class DiagramFactory {
    private static ObjectMapper mapper = null;

    static {
        mapper = ObjectMapperProvider.getMapper();
    }

    public static Diagram getDiagram(String json) throws DeserializationException {
        return getObject(Diagram.class, json);
    }

    public static Graph getGraph(String json) throws DeserializationException {
        return getObject(Graph.class, json);
    }

    public static DiagramProfile getProfile(String json) throws DeserializationException {
        return getObject(DiagramProfile.class, json);
    }

    public static AnalysisProfile getAnalysisProfile(String json) throws DeserializationException {
        return getObject(AnalysisProfile.class, json);
    }

    private static <T> T getObject(Class<T> cls, String json) throws DeserializationException {
        try {
            return mapper.readValue(json, cls);
        } catch (Throwable e) {
            throw new DeserializationException("Error mapping json string for [" + cls + "]: " + json, e);
        }
    }
}
