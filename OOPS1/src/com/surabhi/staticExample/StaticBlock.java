package com.surabhi.staticExample;
// this is to show initializationn of static vsriables
public class StaticBlock {

    static int a = 4;
    static int b;

    // static block runs only once when the compiler loads the class no matter how many object you declare
    static {
        System.out.println("I am in static block");
        b = 5 * a;
        System.out.println("in static block a:"+a+" b:"+b);
    }

    public StaticBlock(){
        System.out.println("I am the constructor");
    }

    public static void main(String[] args) {
        StaticBlock.a = 5;
//        StaticBlock sb = new StaticBlock();
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);

        StaticBlock sb2 = new StaticBlock();
        StaticBlock.b +=3;
        System.out.println(StaticBlock.a +" "+ StaticBlock.b);
    }
}
