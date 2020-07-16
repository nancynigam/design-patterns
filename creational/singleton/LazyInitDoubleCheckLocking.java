/*
One of the best implementations
Pros:
Lazy initialization is possible.
It is also thread safe.
Performance overhead gets reduced because of synchronized keyword.
Cons:
First time, it can affect performance.
As cons. of double check locking method is bearable so it can be used for high performance multi-threaded applications.
 */
package creational.design.pattern.singleton;

public class LazyInitDoubleCheckLocking {

    // Volatile keyword here makes sure that the changes made in one thread are immediately reflect in other thread.
    private volatile static LazyInitDoubleCheckLocking instance;

    private LazyInitDoubleCheckLocking(){};

    public LazyInitDoubleCheckLocking getInstance(){
        if(instance == null){
            //synchronized block to remove the overhead of synchronized keyword
            synchronized (LazyInitDoubleCheckLocking.class){
                if(instance == null)
                    instance = new LazyInitDoubleCheckLocking();
            }
        }
        return instance;
    }
}
