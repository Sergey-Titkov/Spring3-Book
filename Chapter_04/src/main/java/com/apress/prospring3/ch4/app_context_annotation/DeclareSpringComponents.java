/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.app_context_annotation;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * @author Clarence
 * Стиль аннотаций, получение бинов идентично.
 */
public class DeclareSpringComponents {

	public static void main(String[] args) {

		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:app-context-annotation.xml");
		ctx.refresh();		
		// Стиль аннотаций, получение бинов идентично.
		MessageProvider messageProvider = ctx.getBean("messageProvider", MessageProvider.class);

    System.out.println("Стиль Аннотаций");
		System.out.println(messageProvider.getMessage());

    System.out.println("");
    System.out.println("Демонстрация внедрения через метод установки");
    MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
    messageRenderer.render();
	}

}
