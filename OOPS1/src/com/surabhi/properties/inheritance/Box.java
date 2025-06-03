package com.surabhi.properties.inheritance;

public class Box {
    double l;
    double h;
    double w=6;

    Box() {
        this.l = -1;
        this.h = -1;
        this.w = 1;
    }

    //cube
    Box(double side) {

//        super(); Object class

        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old){
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }

    public void information(){
        System.out.println("Running the Box");
    }

    public static void greeting(){
        System.out.println("Hi from Box Greeting");
    }
}
