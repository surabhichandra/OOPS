package com.surabhi.properties.polymorphism;
//if you add final here while declaring class, it will prevent inheritance
public class Shapes {
    //if you put final here you will not be able to override the method area in its children this is known as early binding/compile time
    void area(){
        System.out.println("I am in Shapes");
    }
}
