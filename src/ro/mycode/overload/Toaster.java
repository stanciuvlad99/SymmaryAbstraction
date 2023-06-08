package ro.mycode.overload;

public class Toaster extends Appliance{
    public boolean turnOn(int level) {
        //This is NOT an override.
        //Can not change the arguments in an overriding method.
        //this is actually an overLoad, but not an overRIDE.
        return true;
    }

    //The contract of superclass defines how other code can use a method.
    //Whatever the superclass takes as an argument, the subclass overriding the method must use that same argument.
    //And whatever the superclass declares as a return type, the overriding method must declare either the same type or a subclass type.
    //Remember, a subclass object is guaranteed to be able to do anything its superclass declares,
    //so it’s safe to return a subclass where the superclass is expected.

    //That means the access level must be the same, or friendlier.
    //You can’t, for example, override a public method and make it private.
    //What a shock that would be to the code invoking what it thinks (at compile time) is a public method,
    //if suddenly at runtime the JVM slammed the door shut because the overriding version called at runtime is private!
}
