/**
 * Created on Sep 11, 2011
 */
package com.apress.prospring3.ch4.app_context_annotation;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Clarence
 */
@Service("сonfigurableStandardOutMessageRenderer")
public class ConfigurableStandardOutMessageRenderer implements MessageRenderer {

  private MessageProvider messageProvider = null;

  public void render() {
    System.out.println("Метод: " + this.getClass().getName() + ".render");
    if (messageProvider == null) {
      throw new RuntimeException(
        "You must set the property messageProvider of class:"
          + ConfigurableStandardOutMessageRenderer.class.getName());
    }
    System.out.println(messageProvider.getMessage());
  }

  @Resource(name="configurableMessageProvider")
  public void setMessageProvider(MessageProvider provider) {
    this.messageProvider = provider;
  }

  public MessageProvider getMessageProvider() {
    return this.messageProvider;
  }

}
