package com.bms.java.reflection;

import java.lang.annotation.Annotation;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class DynamicGreeter implements Greeter {
    
    private String greet;

    public DynamicGreeter(String greet) {
        this.greet = greet;
    }

    @Override
    public Class<? extends Annotation> annotationType() {
        return DynamicGreeter.class;
    }

    @Override
    public String greet() {
        return greet;
    }

}
