package com.bms.externalizable;

import java.io.*;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Community implements Serializable {

    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Community{" +
                "id=" + id +
                '}';
    }
}
