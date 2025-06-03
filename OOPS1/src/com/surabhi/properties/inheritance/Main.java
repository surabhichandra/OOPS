package com.surabhi.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box= new Box(4);
//        System.out.println(box.l+" "+box.h+" "+box.w);

        BoxWeight box3=new BoxWeight();
        System.out.println(box3.h+" "+box3.weight);

        BoxWeight box4=new BoxWeight(2,3,4,8);
        System.out.println(box4.h+" "+box4.weight);

        Box box5= new BoxWeight(2,3,4,8);
        System.out.println(box5.w);//wont be able to access weight here

        /*
        --there are many variables in both parent and child classes
        --you are given access to variables that are in the ref type i.e. BoxWeight
        --hence, you should have access to weight variable
        -- this also means, that the ones you are trying to access should be initialised
        -- but here, when the obj itself is of type parent class, how will you call the constructor
        -- hence you get an error
        * */
//        BoxWeight box6=new Box(2,3,4);
//        System.out.println(box6);

        BoxPrice box7=new BoxPrice(5,8,200);


        // even if you create object of BoxWeight(), it is still calling greeting() of box class
        Box box = new BoxWeight();
        box.greeting();

        // even if greeting() is not there in BoxWeight, it will call greeting() of parent class Box()
        BoxWeight.greeting();


        Box b = new BoxWeight(); // instance variable can not be overriden. java will take fields from the declared class
        System.out.println(b.w);

        BoxWeight bw = new BoxWeight();
        System.out.println(bw.w);



    }
}
