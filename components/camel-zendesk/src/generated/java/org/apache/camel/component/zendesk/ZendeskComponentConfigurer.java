/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.zendesk;

import java.util.Map;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.ExtendedPropertyConfigurerGetter;
import org.apache.camel.spi.PropertyConfigurerGetter;
import org.apache.camel.spi.ConfigurerStrategy;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.util.CaseInsensitiveMap;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class ZendeskComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, ExtendedPropertyConfigurerGetter {

    private static final Map<String, Object> ALL_OPTIONS;
    static {
        Map<String, Object> map = new CaseInsensitiveMap();
        map.put("serverUrl", java.lang.String.class);
        map.put("bridgeErrorHandler", boolean.class);
        map.put("lazyStartProducer", boolean.class);
        map.put("basicPropertyBinding", boolean.class);
        map.put("configuration", org.apache.camel.component.zendesk.ZendeskConfiguration.class);
        map.put("zendesk", org.zendesk.client.v2.Zendesk.class);
        map.put("oauthToken", java.lang.String.class);
        map.put("password", java.lang.String.class);
        map.put("token", java.lang.String.class);
        map.put("username", java.lang.String.class);
        ALL_OPTIONS = map;
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        ZendeskComponent target = (ZendeskComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.zendesk.ZendeskConfiguration.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "oauthtoken":
        case "oauthToken": target.setOauthToken(property(camelContext, java.lang.String.class, value)); return true;
        case "password": target.setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "serverurl":
        case "serverUrl": target.setServerUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "token": target.setToken(property(camelContext, java.lang.String.class, value)); return true;
        case "username": target.setUsername(property(camelContext, java.lang.String.class, value)); return true;
        case "zendesk": target.setZendesk(property(camelContext, org.zendesk.client.v2.Zendesk.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Map<String, Object> getAllOptions(Object target) {
        return ALL_OPTIONS;
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return boolean.class;
        case "configuration": return org.apache.camel.component.zendesk.ZendeskConfiguration.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "oauthtoken":
        case "oauthToken": return java.lang.String.class;
        case "password": return java.lang.String.class;
        case "serverurl":
        case "serverUrl": return java.lang.String.class;
        case "token": return java.lang.String.class;
        case "username": return java.lang.String.class;
        case "zendesk": return org.zendesk.client.v2.Zendesk.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        ZendeskComponent target = (ZendeskComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": return target.isBridgeErrorHandler();
        case "configuration": return target.getConfiguration();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "oauthtoken":
        case "oauthToken": return target.getOauthToken();
        case "password": return target.getPassword();
        case "serverurl":
        case "serverUrl": return target.getServerUrl();
        case "token": return target.getToken();
        case "username": return target.getUsername();
        case "zendesk": return target.getZendesk();
        default: return null;
        }
    }
}

