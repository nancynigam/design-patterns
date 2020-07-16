package creational.design.pattern.singleton;
/*
    Improvement over EagerInitialization. The only difference is object is created in a static block so that we can have
    access on its creation, like exception handling. In this way also, object is created at the time of class loading.

    Used when there is a chance of exceptions in creating object with eager initialization.
 */
public class EagerStaticInitialization {

    //No need of getInstance() method. Instance can be accessed directly.
    public static final EagerStaticInitialization instance;

    static {
        instance = new EagerStaticInitialization();
    }

    private EagerStaticInitialization(){};


}
