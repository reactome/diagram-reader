package org.reactome.server.tools.diagram.data.mapper;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.mrbean.MrBeanModule;

/**
 * @author Kostas Sidiropoulos <ksidiro@ebi.ac.uk>
 */
public abstract class ObjectMapperProvider {

    private static ObjectMapper mapper = null;

    public static ObjectMapper getMapper() {
        if (mapper == null) {
            initialise();
        }
        return mapper;
    }

    private static void initialise() {
        mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.registerModule(new MrBeanModule());
    }
}
