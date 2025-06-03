package com.surabhi.packages.a;


import static com.surabhi.packages.b.Message.message;

public class Greeting {
    public static void main(String[] args) {
        System.out.println("I am Awesome");
        message();



    }
    public static void message(){
        System.out.println("I am this class message");
    }
}
