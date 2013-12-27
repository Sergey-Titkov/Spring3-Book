package com.apress.prospring3.ch4.app_context_xml;

import org.springframework.context.support.GenericXmlApplicationContext;

/**
 * Описание
 *
 * @author Sergey.Titkov
 * @version 001.00
 * @since 001.00
 */
public class RunMeHierarchy {
  public static void main(String[] args) {
    // Демонстрация работы с вложенынми контекстами.
    // Загружаем родительский контекст.
    GenericXmlApplicationContext parent = new GenericXmlApplicationContext();
    parent.load("classpath:app-context-xml-hierarchy.xml");
    parent.refresh();

    // Загружаем дочерний контекст.
    GenericXmlApplicationContext child = new GenericXmlApplicationContext();
    child.load("classpath:app-context-xml-hierarchy-child.xml");
    child.setParent(parent);
    child.refresh();

    MessageProvider messageProvider = ctx.getBean("messageProviderHelloWorld", MessageProvider.class);

    System.out.println("Стиль XML");
    System.out.println(messageProvider.getMessage());
    if (ctx.getBean("messageProvider", MessageProvider.class) == ctx.getBean("messageProviderHelloWorld", MessageProvider.class)) {
      System.out.println("Демонстрация того, что способ получения по имени и способ получения по id абсолютно идентичны.");
    }

    MessageRenderer messageRenderer;

    System.out.println("");
    System.out.println("Демонстрация внедрения через метод установки");
    messageRenderer = ctx.getBean("messageRenderer", MessageRenderer.class);
    messageRenderer.render();
    System.out.println("");
    System.out.println("Демонстрация внедрения через конструктор.");
    // В случае использоания XML никаких танцев дополнительных не нужно. И класс не нужно дополнительный создавать.
    messageRenderer = ctx.getBean("сonfigurableStandardOutMessageRenderer", MessageRenderer.class);
    messageRenderer.render();

    System.out.println("");
    System.out.println("Демонстрация внедрения через конструктор, в случае если конструкторов несколько.");
    // В случае аннотаций мы указываем какой именно конструктор будет австосвязан
    System.out.println((ConstructorConfusion) ctx.getBean("constructorConfusion", ConstructorConfusion.class));

    System.out.println("");
    System.out.println("Демонстрация внедрения простых значений.");
    System.out.println((InjectSimple) ctx.getBean("injectSimple", InjectSimple.class));

    System.out.println("");
    System.out.println("Демонстрация внедрения простых значений с использованием SPeL.");
    System.out.println((InjectSimpleSpel) ctx.getBean("injectSimpleSpel", InjectSimpleSpel.class));

    System.out.println("");
    System.out.println("Демонстрация внедрения бина по ID.");
    System.out.println((InjectRef) ctx.getBean("injectRefID", InjectRef.class));

    System.out.println("");
    System.out.println("Демонстрация внедрения бина по Name.");
    System.out.println((InjectRef) ctx.getBean("injectRefName", InjectRef.class));

  }

}
