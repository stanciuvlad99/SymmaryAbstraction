package ro.mycode.animals.canine;

import ro.mycode.animals.Animal;

//We decide that Canines could use a common roam() method, because they tend to move in packs.
//We also see that Felines could use a common roam() method, because they tend to avoid others of their own kind.
//We’ll let Hippo continue to use its inherited roam() method— the generic one it gets from Animal.
public class Canine extends Animal {

    //Remember that when one class inherits from another, we say that the subclass extends the superclass.
    //When you want to know if one thing should extend another, apply the IS-A test.
    public void roam(){
        System.out.println("Ragete de animale canine");
    }
}
