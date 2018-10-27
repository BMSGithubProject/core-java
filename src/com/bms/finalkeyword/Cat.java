package com.bms.finalkeyword;

/** Created - 27/10/2017
 * @author BMS Team
 */
public final class Cat {

    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void methodWithFinalArguments(final int x) {
        // x=1;
    }
}
