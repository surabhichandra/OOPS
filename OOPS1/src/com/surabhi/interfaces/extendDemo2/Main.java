package com.surabhi.interfaces.extendDemo2;

public class Main implements A,B {
//the access modifier of the overridden method should always be the same as the parent
    //for eg. if parent method is protected then child method can be public or protected but not private
    @Override
    public void greet() {
        
    }

    public static void main(String[] args) {
        Main obj= new Main();
        A.greeting();//static methods are called by the name of the interface
    }
}
