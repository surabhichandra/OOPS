package com.surabhi.abstractDemo;

public class Daughter extends Parent{
    public Daughter(int age) {
        super(age);
    }
    @Override
    void career(){
        System.out.println("I am oging to be a doctor");
    }
    @Override
    void partner(){
        System.out.println("I like iron man");
    }
}
