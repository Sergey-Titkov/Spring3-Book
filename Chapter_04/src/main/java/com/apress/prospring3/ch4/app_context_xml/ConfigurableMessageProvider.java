/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.app_context_xml;

/**
 * @author Clarence
 *
 */
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;
    
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }    

    public String getMessage() {
        return message;
    }

}