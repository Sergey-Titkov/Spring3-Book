/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.simple;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.FileSystemResource;

/**
 * @author Clarence
 * Самый простой пример реализации
 */
public class SimpleBeanFactory {

	public static void main(String[] args) {

		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();
        XmlBeanDefinitionReader rdr = new XmlBeanDefinitionReader(factory);
        rdr.loadBeanDefinitions(new FileSystemResource("src/main/resources/simple.xml"));
        Oracle oracle = (Oracle)factory.getBean("oracle");
        System.out.println(oracle.defineMeaningOfLife());
	}

}
