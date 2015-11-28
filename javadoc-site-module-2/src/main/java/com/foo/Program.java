package com.foo;


public class Program {
    Service service = new Service();

    public void greeter(String name) {
        System.out.println(service.hello(name));
    }
}
