/*
Pros:
Object is created only if it is needed. It may overcome resource overcome and wastage of CPU time.
Exception handling is also possible in method.

Cons:
Every time a condition of null has to be checked.
instance can’t be accessed directly.
In multithreaded environment, it may break singleton property.
 */

package creational.design.pattern.singleton;

public class LazyInitialization {

    private static LazyInitialization instance;

    private LazyInitialization(){};

    public static LazyInitialization getInstance(){
        if(instance == null)
            instance = new LazyInitialization();
        return instance;
    }
}
