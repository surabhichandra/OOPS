package com.surabhi.cloning;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException{
        Human surabhi= new Human(24, "Surabhi Chandra");
        Human twin= new Human(surabhi);//this takes a lot of time as it creates a new obj hence we can use clone method
        Human twin2= surabhi.clone();

        System.out.println(surabhi);
        System.out.println(twin);
        System.out.println(twin2);

        twin2.arr.add(77);
        System.out.println();

        System.out.println(surabhi);
        System.out.println(twin);
        System.out.println(twin2);
    }
}
