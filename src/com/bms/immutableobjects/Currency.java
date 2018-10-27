package com.bms.immutableobjects;

/** Created - 27/10/2017
 * @author BMS Team
 */
public final class Currency {

    private final String value;
    
    private Currency(String currencyValue) {
        value = currencyValue;
    }
    
    public String getValue() {
        return value;
    }
    
    public static Currency of(String value) {
        return new Currency(value);
    }
}
