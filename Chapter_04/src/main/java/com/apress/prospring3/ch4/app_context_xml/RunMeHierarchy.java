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

    System.out.println("Демонстрация вложенных контекстов XML");
    System.out.println("");

    System.out.println("Родительский контекст. Обращаюсь к бину этого контекста. " + ((SimpleTarget) child.getBean("parent01")).getVal());
    // Обращаться к бину дочернего контекста, даже по явно по уникальному имени невозможно

    System.out.println("");
    System.out.println("Дочерний контекст.     Обращаемся к бину родительского контекста. По уникальному имени. " + ((SimpleTarget) child.getBean("сhild01")).getVal());
    System.out.println("Дочерний контекст.     Явно обращаемся к бину родительского контекста. С помощью директивы parent. " + ((SimpleTarget) child.getBean("сhild02")).getVal());
    System.out.println("Дочерний контекст.     Обращаемся к бину этого контекста. Он \"главнее\" одноименного бина из родительского контекста. " + ((SimpleTarget) child.getBean("сhild03")).getVal());

  }

}
