package ro.mycode.bathroom;

//Tub and Bathroom are related, but not through inheritance.
//Tub and Bathroom are joined by a HAS-A relationship.
//Does it make sense to say “Bathroom HAS-A Tub”?
//If yes, then it means that Bathroom has a Tub instance variable.
//In other words, Bathroom has a reference to a Tub, but Bathroom does not extend Tub and vice versa.

public class Tub{

    int size;
    Bubbles b;

}
