package com.surabhi.properties.inheritance;

public class BoxWeight extends Box {
    double weight;
    double w;

    public BoxWeight(){
        super();
        this.weight=-1;
    }

    BoxWeight (BoxWeight other){
        super(other);//reference type is box it will be like Box box5= new BoxWeight(2,3,4,8);
        weight=other.weight;
    }

    BoxWeight (double side, double weight){
        super(side);//reference type is box it will be like Box box5= new BoxWeight(2,3,4,8);
        this.weight=weight;
    }



    public BoxWeight(double l, double h, double w, double weight) {
        //if no super present for parent, then default constructor of parent will be called
        super(l, h, w);// what is this? this calls the parent class constructor
        //used to initialise values present in parent class
//        this.h//this will give error but
//        super.h//this will not give error
//        System.out.println(super.weight);//if weight is also present in parent class and you want to access weight of parent class then u can do super.weight else this.weight
        this.weight = weight;
//        super(l,h,w);//should be first line
    }

//    @Override static methods can not overridden but can be inherited becasue it is not attached to object, rather it is attached to class. And override only works on objects.
    public static void greeting(){
        System.out.println("Hi from Boxweight Greeting");
    }
}
