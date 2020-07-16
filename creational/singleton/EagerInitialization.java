/*
Pros:
Very simple to implement and thread safe.

Cons:
May lead to resource wastage. Because instance of class is created always, whether it is required or not.
CPU time is also wasted in creation of instance if it is not required.
Exception handling is not possible.

Use this method only when your singleton class is light and is used throughout the
execution of your program.

 */


package creational.design.pattern.singleton;

public class EagerInitialization {

    //Object of class is created when it is loaded to the memory by JVM. final keyword is optional
    private static final EagerInitialization instance = new EagerInitialization();

    //Private constructors
    private EagerInitialization(){};

    public static EagerInitialization getInstance(){
        return instance;
    }
}
