/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.splunkhec;

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
public class SplunkHECEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer, PropertyConfigurerGetter {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        SplunkHECEndpoint target = (SplunkHECEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "host": target.getConfiguration().setHost(property(camelContext, java.lang.String.class, value)); return true;
        case "https": target.getConfiguration().setHttps(property(camelContext, boolean.class, value)); return true;
        case "index": target.getConfiguration().setIndex(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "skiptlsverify":
        case "skipTlsVerify": target.getConfiguration().setSkipTlsVerify(property(camelContext, boolean.class, value)); return true;
        case "source": target.getConfiguration().setSource(property(camelContext, java.lang.String.class, value)); return true;
        case "sourcetype":
        case "sourceType": target.getConfiguration().setSourceType(property(camelContext, java.lang.String.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        default: return false;
        }
    }

    @Override
    public Class<?> getOptionType(String name, boolean ignoreCase) {
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return boolean.class;
        case "host": return java.lang.String.class;
        case "https": return boolean.class;
        case "index": return java.lang.String.class;
        case "lazystartproducer":
        case "lazyStartProducer": return boolean.class;
        case "skiptlsverify":
        case "skipTlsVerify": return boolean.class;
        case "source": return java.lang.String.class;
        case "sourcetype":
        case "sourceType": return java.lang.String.class;
        case "synchronous": return boolean.class;
        default: return null;
        }
    }

    @Override
    public Object getOptionValue(Object obj, String name, boolean ignoreCase) {
        SplunkHECEndpoint target = (SplunkHECEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "basicpropertybinding":
        case "basicPropertyBinding": return target.isBasicPropertyBinding();
        case "host": return target.getConfiguration().getHost();
        case "https": return target.getConfiguration().isHttps();
        case "index": return target.getConfiguration().getIndex();
        case "lazystartproducer":
        case "lazyStartProducer": return target.isLazyStartProducer();
        case "skiptlsverify":
        case "skipTlsVerify": return target.getConfiguration().isSkipTlsVerify();
        case "source": return target.getConfiguration().getSource();
        case "sourcetype":
        case "sourceType": return target.getConfiguration().getSourceType();
        case "synchronous": return target.isSynchronous();
        default: return null;
        }
    }
}

