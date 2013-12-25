/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.app_context_xml;

import com.apress.prospring3.ch4.app_context_annotation.MessageProvider;
import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Clarence
 *
 */
public class DeclareSpringComponents {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-xml.xml");
		ctx.refresh();
    // Стиль xml, получение бинов идентично.
		MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);

    System.out.println("Стиль XML");
		System.out.println(messageProvider.getMessage());
	}

}
