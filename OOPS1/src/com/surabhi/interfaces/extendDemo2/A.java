package com.surabhi.interfaces.extendDemo2;

public interface A {

    //static methods cannot be inherited hence cant be overriden hence should have a body over here
    //static interface methods should always have a body
    //call via the interface name
    static void greeting(){
        System.out.println("Hey I am Static method");
    }

    default void fun(){
        System.out.println("I am in A");
    }
}
