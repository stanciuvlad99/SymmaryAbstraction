package ro.mycode.vet;

import ro.mycode.animals.Animal;

public class Vet {
    public void giveShot(Animal a){
        //The "a" parameter can take ANY Animal type as the argument.
        //And when the Vet is done giving the shot, it tells the Animal to makeNoies(), and whatever Animal is really out there on the heap,
        // that's whose makeNoies() method will run
        a.makeNoise();
    }
}
