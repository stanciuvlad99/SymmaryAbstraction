package ro.mycode;

import ro.mycode.animals.Animal;
import ro.mycode.animals.Hippo;
import ro.mycode.animals.canine.Dog;
import ro.mycode.animals.canine.Wolf;
import ro.mycode.animals.feline.Cat;
import ro.mycode.animals.feline.Lion;

public class Polimorphism {

    public static void main(String[] args) {

        //To see how polymorphism works, we have to step back and look at the way we normally declare a reference and create an object

        //Declare a reference variable
        //Tells the JVM to allocate space for a reference variable.
        //The referencevariable is, forever, of type Dog.
        //In other words, a remote control that has buttons to control a Dog, but not a Cat or a Button or a Socket.
        //Dog MyDog

        //Create an object
        //Tells the JVM to allocate space for a new Dog object on the garbage collectible heap
        //new Dog()

        //Link the object and the reference
        //Assigns the new Dog to the reference variable myDog. In other words, program the remote control.
        //=

        Dog myDog=new Dog();
        //These two are the same type.
        //The reference variable type is declared as Dog, and the object is created as new Dog()

        //But with polymorphism, the reference type and the object type can be different.
        ///With polymorphism, the reference type can be a superclass of the actual object type.

        Animal animal = new Dog();
        //These two are not the same type.
        //The reference variable type is declared as Animal, but the object is created as new Dog()
        //With polymorphism, the reference type can be a superclass of the actual object type.

        //Declare an array of type Animal.
        //In other words, an array that will hold objects of type Animal
        Animal[] animals = new Animal[5];

        //You can put ANY subclass of Animal in the Animal array.
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Wolf();
        animals[3] = new Hippo();
        animals[4] = new Lion();

        //You can get to loop through the array and call one of the Animal-class methods, and every object does the right thing.
        for (Animal animal1:animals){
            //On the first pass throught the loop "animal" is a Dog, so you get the Dog's eat() method.
            //On the next pass, "animal" is a Cat, so you get the Cat's eat() method.
            animal1.eat();

            //Same with the roam()
            animal1.roam();
        }
    }


}
