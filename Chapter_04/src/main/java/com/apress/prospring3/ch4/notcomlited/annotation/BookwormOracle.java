/**
 * Created on Sep 20, 2011
 */
package com.apress.prospring3.ch4.notcomlited.annotation;

import org.springframework.stereotype.Service;

import com.apress.prospring3.ch4.simple.Oracle;

/**
 * @author Clarence
 *
 */
@Service("oracle")
public class BookwormOracle implements Oracle {

    public String defineMeaningOfLife() {
        return "Encyclopedias are a waste of money - use the Internet";
    }	
	
}
