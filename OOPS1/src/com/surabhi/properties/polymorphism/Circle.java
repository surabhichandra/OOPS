package com.surabhi.properties.polymorphism;

public class Circle extends Shapes{
    //this will run when obj of Circle is created
    //hence it is overriding the parent area method
    @Override //this is called annotation
    void area(){
        System.out.println("Area is pi*r*r");
    }
}
