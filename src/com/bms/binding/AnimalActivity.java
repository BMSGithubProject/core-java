package com.bms.binding;


/** Created - 27/10/2017
 * @author BMS Team
 */
public class AnimalActivity {



    public static void sleep(Animal animal) {
    	System.out.println("Animal is sleeping");
    }

    public static void sleep(Cat cat) {
    	System.out.println("Cat is sleeping");
    }

    public static void main(String[] args) {

        Animal animal = new Animal();

        //calling methods of animal object
        animal.makeNoise();

        animal.makeNoise(3);


        //assigning a dog object to reference of type Animal
        Animal catAnimal = new Cat();

        catAnimal.makeNoise();

        // calling static function
        AnimalActivity.sleep(catAnimal);

        return;

    }
}
