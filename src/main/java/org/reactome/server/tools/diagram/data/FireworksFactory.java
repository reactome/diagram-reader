package org.reactome.server.tools.diagram.data;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.reactome.server.tools.diagram.data.exception.DeserializationException;
import org.reactome.server.tools.diagram.data.fireworks.graph.FireworksGraph;
import org.reactome.server.tools.diagram.data.fireworks.profile.FireworksProfile;
import org.reactome.server.tools.diagram.data.mapper.ObjectMapperProvider;

/**
 * @author Kostas Sidiropoulos <ksidiro@ebi.ac.uk>
 */
public abstract class FireworksFactory {
    private static ObjectMapper mapper = null;

    static {
        mapper = ObjectMapperProvider.getMapper();
    }

    public static FireworksGraph getGraph(String json) throws DeserializationException {
        return getObject(FireworksGraph.class, json);
    }

    public static FireworksProfile getProfile(String json) throws DeserializationException {
        return getObject(FireworksProfile.class, json);
    }

    private static <T> T getObject(Class<T> cls, String json) throws DeserializationException {
        try {
            return mapper.readValue(json, cls);
        } catch (Throwable e) {
            throw new DeserializationException("Error mapping json string for [" + cls + "]: " + json, e);
        }
    }
}
