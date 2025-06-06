package com.surabhi.abstractDemo;

//you cannot put final here for declaring class as it will not be able to inherit
public abstract class Parent {
    //YOU CAN ALSO MAKE AGE STATIC
    int age;
    final int VALUE;

    public Parent(int age) {
        this.age = age;
        VALUE=874764;
    }

    //abstract constructors are not allowed
//    abstract Parent();
    //there is no point in writing abstract static methods as they cannot be overridden
    static void hello(){
        System.out.println("hey");
    }

    void normal(){
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
