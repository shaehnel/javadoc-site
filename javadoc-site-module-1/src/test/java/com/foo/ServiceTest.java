package com.foo;


import org.junit.Assert;
import org.junit.Test;

public class ServiceTest {

    @Test
    public void testHello() throws Exception {
        Assert.assertNotNull(new Service().hello("name"));
    }
}