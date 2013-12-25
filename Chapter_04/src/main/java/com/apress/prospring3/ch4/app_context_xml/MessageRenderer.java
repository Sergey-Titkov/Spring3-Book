/**
 * Created on Sep 11, 2011
 */
package com.apress.prospring3.ch4.app_context_xml;

import com.apress.prospring3.ch4.app_context_annotation.MessageProvider;

/**
 * @author Clarence
 *
 */
public interface MessageRenderer {

	public void render();
	
	public void setMessageProvider(com.apress.prospring3.ch4.app_context_annotation.MessageProvider provider);

	public MessageProvider getMessageProvider();
	
}
