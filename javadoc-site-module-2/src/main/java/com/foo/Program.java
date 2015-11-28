package com.foo;

/**
 * the program
 * {@link Service}
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
