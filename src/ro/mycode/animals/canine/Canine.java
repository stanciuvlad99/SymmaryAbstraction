package ro.mycode.animals.canine;

import ro.mycode.animals.Animal;

//We decide that Canines could use a common roam() method, because they tend to move in packs.
//We also see that Felines could use a common roam() method, because they tend to avoid others of their own kind.
//We’ll let Hippo continue to use its inherited roam() method— the generic one it gets from Animal.
public class Canine extends Animal {

    public void roam(){
        System.out.println("Ragete de animale canine");
    }
}
