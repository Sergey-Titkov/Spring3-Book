/**
 * Created on Sep 21, 2011
 */
package com.apress.prospring3.ch4.app_context_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

/**
 * @author Clarence
 *
 */
// Отложенное создание добавлено для наглядности, что было видно какой именно конструктор будет вызван
@Service("constructorConfusion")
@Lazy
public class ConstructorConfusion {

    private String someValue;

    public ConstructorConfusion(String someValue) {
        System.out.println("Конструктор: " + this.getClass().getName() + ".ConstructorConfusion(String someValue)");
        this.someValue = someValue;
    }

    @Autowired
    // Аннотация может быть примененеа только к одному из конструторов!
    public ConstructorConfusion(@Value("90")Integer someValue) {
        System.out.println("Конструктор: " + this.getClass().getName() + ".ConstructorConfusion(Integer someValue)");
        this.someValue = "Number: " + Integer.toString(someValue);
    }
    
    public String toString() {
        return someValue;
    }

}
