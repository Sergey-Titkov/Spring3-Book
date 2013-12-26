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

    // Он у нас один на всех.
    MessageRenderer messageRendere;

    System.out.println("");
    System.out.println("Демонстрация внедрения через метод установки");
    messageRendere = ctx.getBean("messageRenderer", MessageRenderer.class);
    messageRendere.render();

    System.out.println("");
    System.out.println("Демонстрация внедрения через конструктор.");
    // Вот тут начались танцы с бубном, дело в том, что я не знаю как заставить сприг сгенерить атвоматически
    // несколько бинов с разными внедрениями. Поэтому пришлось создать отдлеьный класс.
    messageRendere = ctx.getBean("сonfigurableStandardOutMessageRenderer", MessageRenderer.class);
    messageRendere.render();

    System.out.println("");
    System.out.println("Демонстрация внедрения через конструктор, в случае если конструкторов несколько.");
    // В случае аннотаций мы указываем какой именно конструктор будет австосвязан
    System.out.println( (ConstructorConfusion)ctx.getBean("constructorConfusion", ConstructorConfusion.class));
	}

}
