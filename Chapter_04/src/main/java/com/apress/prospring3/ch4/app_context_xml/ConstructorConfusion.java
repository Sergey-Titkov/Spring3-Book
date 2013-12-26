/**
 * Created on Sep 21, 2011
 */
package com.apress.prospring3.ch4.app_context_xml;

/**
 * @author Clarence
 *
 */
// Отложенное создание добавлено для наглядности, что было видно какой именно конструктор будет вызван
public class ConstructorConfusion {

  private String someValue;

  public ConstructorConfusion(String someValueString) {
    System.out.println("Конструктор: " + this.getClass().getName() + ".ConstructorConfusion(String someValueString)");
    this.someValue = someValueString;
  }

  public ConstructorConfusion(Integer someValueInteger) {
    System.out.println("Конструктор: " + this.getClass().getName() + ".ConstructorConfusion(Integer someValueInteger)");
    this.someValue = "Number: " + Integer.toString(someValueInteger);
  }

  public String toString() {
    return someValue;
  }

}

