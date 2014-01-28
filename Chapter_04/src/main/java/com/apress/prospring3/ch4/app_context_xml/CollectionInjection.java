/**
 * Created on Sep 21, 2011
 */
package com.apress.prospring3.ch4.app_context_xml;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @author Clarence
 */
public class CollectionInjection {

  private Map<String, Object> map;

  private Properties props;

  private Set set;

  private List list;


  public void setList(List list) {
    this.list = list;
  }

  public void setSet(Set set) {
    this.set = set;
  }

  public void setMap(Map<String, Object> map) {
    this.map = map;
  }

  public void setProps(Properties props) {
    this.props = props;
  }

  public void displayInfo() {

    // display the Map
    System.out.println("Map contents:\n");
    for (Map.Entry<String, Object> entry : map.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
    }

    // display the properties
    System.out.println("\nProperties contents:\n");
    for (Map.Entry<Object, Object> entry : props.entrySet()) {
      System.out.println("Key: " + entry.getKey() + " - Value: " + entry.getValue());
    }

    // display the set
    System.out.println("\nSet contents:\n");
    for (Object obj : set) {
      System.out.println("Value: " + obj);
    }

    // display the list
    System.out.println("\nList contents:\n");
    for (Object obj : list) {
      System.out.println("Value: " + obj);
    }
  }
}
