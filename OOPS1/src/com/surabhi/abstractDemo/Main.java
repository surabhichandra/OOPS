package com.surabhi.abstractDemo;


public class Main {
    public static void main(String[] args) {
        Son son=new Son(16);
        son.career();
        son.partner();
        son.normal();
        Daughter daughter=new Daughter(14);
        daughter.career();
        daughter.partner();
        daughter.normal();
//        Parent mom=new Parent(40);//you cannot create objects of an abstract class
        Parent.hello();//calling through classname as static

        //even though you cannot create an object of parent abstract class you can use it as a reference variable
        Daughter daughter2=new Daughter(13);

    }
}
