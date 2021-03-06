/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.infinispan;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class InfinispanComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.infinispan.InfinispanConfiguration getOrCreateConfiguration(InfinispanComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.infinispan.InfinispanConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        InfinispanComponent target = (InfinispanComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cachecontainer":
        case "cacheContainer": getOrCreateConfiguration(target).setCacheContainer(property(camelContext, org.infinispan.commons.api.BasicCacheContainer.class, value)); return true;
        case "cachecontainerconfiguration":
        case "cacheContainerConfiguration": getOrCreateConfiguration(target).setCacheContainerConfiguration(property(camelContext, java.lang.Object.class, value)); return true;
        case "clusteredlistener":
        case "clusteredListener": getOrCreateConfiguration(target).setClusteredListener(property(camelContext, boolean.class, value)); return true;
        case "command": getOrCreateConfiguration(target).setCommand(property(camelContext, java.lang.String.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.infinispan.InfinispanConfiguration.class, value)); return true;
        case "configurationproperties":
        case "configurationProperties": getOrCreateConfiguration(target).setConfigurationProperties(property(camelContext, java.util.Map.class, value)); return true;
        case "configurationuri":
        case "configurationUri": getOrCreateConfiguration(target).setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "customlistener":
        case "customListener": getOrCreateConfiguration(target).setCustomListener(property(camelContext, org.apache.camel.component.infinispan.InfinispanCustomListener.class, value)); return true;
        case "eventtypes":
        case "eventTypes": getOrCreateConfiguration(target).setEventTypes(property(camelContext, java.lang.String.class, value)); return true;
        case "flags": getOrCreateConfiguration(target).setFlags(property(camelContext, java.lang.String.class, value)); return true;
        case "hosts": getOrCreateConfiguration(target).setHosts(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "operation": getOrCreateConfiguration(target).setOperation(property(camelContext, org.apache.camel.component.infinispan.InfinispanOperation.class, value)); return true;
        case "querybuilder":
        case "queryBuilder": getOrCreateConfiguration(target).setQueryBuilder(property(camelContext, org.apache.camel.component.infinispan.InfinispanQueryBuilder.class, value)); return true;
        case "remappingfunction":
        case "remappingFunction": getOrCreateConfiguration(target).setRemappingFunction(property(camelContext, java.util.function.BiFunction.class, value)); return true;
        case "resultheader":
        case "resultHeader": getOrCreateConfiguration(target).setResultHeader(property(camelContext, java.lang.Object.class, value)); return true;
        case "sync": getOrCreateConfiguration(target).setSync(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

}

