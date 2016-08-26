package org.reactome.server.tools.diagram.data.graph.factory;

import com.google.web.bindery.autobean.shared.AutoBean;
import com.google.web.bindery.autobean.shared.AutoBeanCodex;
import com.google.web.bindery.autobean.shared.AutoBeanFactory;
import com.google.web.bindery.autobean.vm.AutoBeanFactorySource;
import org.reactome.server.tools.diagram.data.graph.EntityNode;
import org.reactome.server.tools.diagram.data.graph.EventNode;
import org.reactome.server.tools.diagram.data.graph.Graph;
import org.reactome.server.tools.diagram.data.exception.DeserializationException;


/**
 * @author Antonio Fabregat <fabregat@ebi.ac.uk>
 */
public class GraphObjectsFactory {

    @SuppressWarnings("UnusedDeclaration")
    interface ModelAutoBeanFactory extends AutoBeanFactory {
        AutoBean<Graph> graph();
        AutoBean<EntityNode> graphEntityNode();
        AutoBean<EventNode> graphEventNode();
    }

    public static <T> T getObject(Class<T> cls, String json) throws DeserializationException {
        try{
            AutoBeanFactory factory = AutoBeanFactorySource.create(ModelAutoBeanFactory.class);
            AutoBean<T> bean = AutoBeanCodex.decode(factory, cls, json);
            return bean.as();
        }catch (Throwable e){
            throw new DeserializationException("Error mapping json string for [" + cls + "]: " + json, e);
        }
    }
}
