/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.app_context_xml;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Clarence
 *
 */
@Service("messageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;
    
    /*
    @Autowired
    public ConfigurableMessageProvider(@Value("This is a configurable message") String message) {
        this.message = message;
    }
    */
    
    @Autowired
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }    

    public String getMessage() {
        return message;
    }

}