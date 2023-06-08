package ro.mycode.vet;

import ro.mycode.animals.Hippo;
import ro.mycode.animals.canine.Dog;

public class PetOwner {
    public void start(){
        Vet vet = new Vet();
        Dog dog = new Dog();
        Hippo hippo = new Hippo();
        vet.giveShot(dog);
        vet.giveShot(hippo);
        //The Vet's giveShot method can take any Animal you give it.
        //As long as the object you pass in as the argument is a subclass of Animal.
    }

    //If you write that Vet class using arguments declared as type Animal, your code can handle any Animal subclass.
    //That means if others want to take advantage of your Vet class, all they have to do is make sure their new Animal types extend class Animal.
    //The Vet methods will still work, even though the Vet class was written without any knowledge of the new Animal subtypes the Vet will be working on.
}
