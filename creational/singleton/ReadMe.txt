When to use What?

1. Eager initialization is easy to implement but it may cause resource and CPU time wastage.
Use it only if cost of initializing a class is less in terms of resources or your program will always need the instance of class.

2. By using Static block in Eager initialization we can provide exception handling and also can control over instance.

3. Using synchronized we can create singleton class in multi-threading environment also but it can cause slow performance,
so we can use Double check locking mechanism.

4. Bill Pugh implementation is most widely used approach for singleton classes. Most developers prefer it because of its
simplicity and advantages.