/*
Pros:
Lazy initialization is possible.
It is also thread safe.
Cons:
getInstance() method is synchronized so it causes slow performance as multiple threads can’t access it simultaneously.
 */
package creational.design.pattern.singleton;

public class LazyInitializationThreadSafe {

    private static LazyInitializationThreadSafe instance;

    private LazyInitializationThreadSafe(){};

    public synchronized LazyInitializationThreadSafe getInstance(){
        if(instance == null)
            instance = new LazyInitializationThreadSafe();
        return instance;
    }
}
