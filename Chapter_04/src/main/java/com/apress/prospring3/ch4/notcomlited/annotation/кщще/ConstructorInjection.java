/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.notcomlited.annotation.кщще;

import com.apress.prospring3.ch4.cdl.Dependency;

/**
 * @author Clarence
 *
 */
public class ConstructorInjection {

    private Dependency dependency;
    
    public ConstructorInjection(Dependency dependency) {
        this.dependency = dependency;
    }	
	
}
