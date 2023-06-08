package ro.mycode;

import ro.mycode.animals.canine.Wolf;

public class Abstraction {
    public static void main(String[] args) {

        //The Wolf class has four methods.
        //One inherited from Animal, one inherited from Canine (which is actually an overridden version of a method in classAnimal), and two overridden in the Wolf class.
        //When you create a Wolf object and assign it to a variable, you can use the dot operator on that reference variable to invoke all four methods.
        //But which version of those methods gets called?

        Wolf wolf = new Wolf();
        wolf.makeNoise();
        wolf.roam();
        wolf.eat();
        wolf.sleep();
    }
}