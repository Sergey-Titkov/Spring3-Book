/**
 * Created on Sep 21, 2011
 */
package com.apress.prospring3.ch4.app_context_xml;

/**
 * @author Clarence
 *
 */
public class InjectRef {

    private Oracle oracle;
    
    public void setOracle(Oracle oracle) {
        this.oracle = oracle;
        System.out.println(oracle.defineMeaningOfLife());
    }	
	
}
