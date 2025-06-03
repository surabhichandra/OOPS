package com.surabhi.staticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean isMarried;
    public static int population;

    static void message(){
        System.out.println("Hello world");
//        System.out.println(this.age);//cannot non static member varialbe in static method.
    }
    public Human(int age, String name, int salary, boolean isMarried) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.isMarried = isMarried;
        Human.population +=1;
    }
}
