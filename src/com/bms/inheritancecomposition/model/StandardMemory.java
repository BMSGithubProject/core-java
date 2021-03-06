package com.bms.inheritancecomposition.model;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class StandardMemory implements Memory {
    
    private String brand;
    private String size;

    public StandardMemory(String brand, String size) {
        this.brand = brand;
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }
    
    public String getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Memory{" + "brand=" + brand + ", size=" + size + "}";
    }
}
