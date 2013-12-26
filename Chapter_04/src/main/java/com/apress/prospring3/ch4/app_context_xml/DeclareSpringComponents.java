/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.app_context_xml;

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
    // Получаем бин не по идентификатроу, а по имени.
		MessageProvider messageProvider = ctx.getBean("messageProviderHelloWorld", MessageProvider.class);

    System.out.println("Стиль XML");
		System.out.println(messageProvider.getMessage());
    if (ctx.getBean("messageProvider", MessageProvider.class) == ctx.getBean("messageProviderHelloWorld", MessageProvider.class) ){
      System.out.println("Демонстрация того, что способ получения по имени и способ получения по id абсолютно идентичны.");
    }

    System.out.println("");
    System.out.println("Демонстрация внедрения через метод установки");
    MessageRenderer messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
    messageRenderer.render();
	}

}
