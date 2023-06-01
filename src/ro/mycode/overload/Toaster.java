package ro.mycode.toaster;

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
}
