package com.bms.java.reflection;


import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/** Created - 27/10/2017
 * @author BMS Team
 */

@Retention(RetentionPolicy.RUNTIME)
public @interface Greeter {

    public String greet() default "";
}
