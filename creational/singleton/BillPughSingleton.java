/*
When the singleton class is loaded, inner class is not loaded and hence doesn’t create object when loading the class.
Inner class is created only when getInstance() method is called. So it may seem like eager initialization but it is lazy
initialization.
This is the most widely used approach as it doesn’t use synchronization.

How is it thread safe ?
static inner class - inner classes are not loaded until they are referenced.
Because the semantic for loading and initializing classes is defined in a way that it is only done once and the
static final fields are published safely
 */
package creational.design.pattern.singleton;

public class BillPughSingleton {

    private BillPughSingleton(){};

    private static class InnerClass{
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return InnerClass.instance;
    }
}
