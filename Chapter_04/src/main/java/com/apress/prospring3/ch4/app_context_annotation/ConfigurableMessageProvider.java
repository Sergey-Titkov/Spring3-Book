/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.app_context_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Clarence
 *
 */
@Service("configurableMessageProvider")
public class ConfigurableMessageProvider implements MessageProvider {

    private String message;
    
    @Autowired
    // Поскольку message у нас констаната она вынесена в xml файл конфигурации.
    // Хороший пример смешанного подхода. Если же хочется прямо в java коде то следует написать
    // public ConfigurableMessageProvider(@Value("This is a configurable message") String message)
    public ConfigurableMessageProvider(String message) {
        this.message = message;
    }    

    public String getMessage() {
        return message;
    }

}