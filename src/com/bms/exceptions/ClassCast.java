package com.bms.exceptions;

/** Created - 27/10/2017
 * @author BMS Team
 */
class Animal {

}

class Dog extends Animal {

}

class Lion extends Animal {

}

public class ClassCast {

	public static void main(String[] args) {

		try {
			Animal animalOne = new Dog(); // At runtime the instance is dog
			Dog bruno = (Dog) animalOne; // Downcasting

			Animal animalTwo = new Lion(); // At runtime the instance is animal
			Dog tommy = (Dog) animalTwo; // Downcasting
		} catch (ClassCastException e) {
			System.err.println("ClassCastException caught!");
		}

	}

}
