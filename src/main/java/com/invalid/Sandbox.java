package com.invalid;

public class Sandbox {
    public static void main(String[] args) {
        String s = "hello";

        setContent(s);
        System.out.println(s);
    }

    public static void setContent(String v) {
        v = "1";
    }
}
