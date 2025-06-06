package com.surabhi.abstractDemo;

public class Son extends Parent{

    public Son(int age) {
        super(age);
    }

    @Override
    void normal() {
        super.normal();
    }

    @Override
    void career(){
        System.out.println("I am oging to be an engineer ");
    }
    @Override
    void partner(){
        System.out.println("I like Harley Quinn");
    }
}
