package com.bms.java.enumiteration;

import java.util.stream.Stream;

/** Created - 27/10/2017
 * @author BMS Team
 */
public enum DaysOfWeekEnum {
	SUNDAY("off"), 
	MONDAY("working"), 
	TUESDAY("working"), 
	WEDNESDAY("working"), 
	THURSDAY("working"), 
	FRIDAY("working"), 
	SATURDAY("off");

	private String typeOfDay;

	DaysOfWeekEnum(String typeOfDay) {
		this.typeOfDay = typeOfDay;
	}
	
	public String getTypeOfDay() {
		return typeOfDay;
	}

	public void setTypeOfDay(String typeOfDay) {
		this.typeOfDay = typeOfDay;
	}

	public static Stream<DaysOfWeekEnum> stream() {
		return Stream.of(DaysOfWeekEnum.values());
	}
}
