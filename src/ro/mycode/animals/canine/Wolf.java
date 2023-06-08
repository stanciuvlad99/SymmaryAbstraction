package ro.mycode.animals.canine;

//In Java, we say that the subclass extends the superclass.
//An inheritance relationship means that the subclass inherits the members of the superclass.
//When we say “members of a class,” we mean the instance variables and methods.

import ro.mycode.animals.Animal;

//“Wolf IS-A Canine, so Wolf can do anything a Canine can do.
//And Wolf IS-A Animal, so Wolf can do anything an Animal can do.”
//It makes no difference if Wolf overrides some of the methods in Animal or Canine.
//As far as the world (of other code) is concerned, a Wolf can do those four methods.
//How he does them, or in which class they’re overridden, makes no difference.
//A Wolf can makeNoise(), eat(), sleep(), and roam() because a Wolf extends from class Animal.
public class Wolf extends Canine {

    //Does a lion make the same noise as a dog? Does a cat eat like a hippo?
    //Maybe in your version, but in ours, eating and making noise are Animal-type-specific.
    //We can’t figure out how to code those methods in such a way that they’d work for any animal.
    //OK, that’s not true.
    //We could write the makeNoise() method, for example, so that all it does is play a sound file defined in an instance variable for that type, but that’s not very specialized.
    //Some animals might make different noises for different situations (like one for eating, and another when bumping into an enemy, etc.)

    @Override
    public void makeNoise(){
        System.out.println("Sunet de lup");
    }
    @Override
    public void eat(){
        System.out.println("Lupul mananca numai carne");
    }


}
