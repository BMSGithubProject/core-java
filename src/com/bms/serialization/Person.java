package com.bms.serialization;
import java.io.Serializable;

/** Created - 27/10/2017
 * @author BMS Team
 */
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private int age;
	private String name;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
