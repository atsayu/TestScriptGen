package com.valid;


import org.testng.annotations.Test;

@Test
public class TestExample {
    public void test1() {
        System.out.println("test1");
        assert (1+1 == 2);
    }

    @Test
    public void test2() {
        System.out.println("test1");
        assert (1+1 == 2);
    }
}
