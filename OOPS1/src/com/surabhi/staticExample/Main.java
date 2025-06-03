package com.surabhi.staticExample;

public class Main {
    public static void main(String[] args) {
        Human nitin = new Human(23,"Nitin", 1,false);
        Human surabhi = new Human(25,"Surabhi", 2,false);
        Human manas = new Human(25,"Manas", 2,false);
        System.out.println(Human.population);
        System.out.println(Human.population);
        System.out.println(Human.population);

//        greeting(); you cannot have a non-static member inside a static
    }
    //this is not dependent on objects
    static void fun(){
//        greeting()//you cant use this because it requires an instance
        //but the func you are using it in does not depend on instances
        Main obj=new Main();
        obj.greeting();

        Main funn=new Main();
        funn.fun2();

    }

    void fun2(){
        greeting();
    }
    //we know that something which is not static, belongs to an object
    void greeting(){
        fun();//you can have static member func inside non-static but not vice versa
        System.out.println("Hello World");
    }
}
