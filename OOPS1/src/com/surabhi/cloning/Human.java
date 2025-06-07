package com.surabhi.cloning;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Human implements Cloneable{
    String name;
    int age;
    List<Integer> arr;
    // java will by default copy only primitve types, but for objects it will shallow copy

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr= new ArrayList<>();
    }

    public Human(Human other) {
        this.age = other.age;
        this.name = other.name;
        this.arr = other.arr;
    }
//by default it expects Object return type not human so we need to typecast it
    @Override
    public Human clone() throws CloneNotSupportedException{
        //if you use java's provided clone it will only clone primitive and string data types
        //and for objects it will clone by reference so we have to make sure that these obj are cloned by deep copy
        Human clone =  (Human)super.clone();
        clone.arr = new ArrayList<>(this.arr);
        return clone;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", arr=" +arr +
                '}';
    }
}
