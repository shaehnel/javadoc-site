package com.foo;

/**
 * the program
 */
public class Program {
    Service service = new Service();

    /**
     * the greeter method
     * @param name
     */
    public void greeter(String name) {
        System.out.println(service.hello(name));
    }
}
