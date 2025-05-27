package com.surabhi.introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a=10;// 128, primitive
        Integer num=450;//creates an object of integer class
        Integer num2=451;

        int b=20;
//        System.out.println(a+" "+b);
        System.out.println(num+" "+num2);
        swap(num,num2);
        swap(a,b);
        System.out.println(num+" "+num2);
//        System.out.println(a+" "+b);

        final int bonus=2;
//        bonus=3;//cant modify final variables and integer is a final class and you always need to initialize a final var while declaring it
        //but if a class has a final member var you cannot assign the value of another class to it but you can change the values of the member variables of it
        final A surabhi= new A("Surabhi Chandra");
        surabhi.name="other name";//can do this
        //when a non primitive is final you cannot reassign it
//        surabhi=new A("new object");//cant do this


        //lets call the garbage collector by reassigning objects from heap which obj A is pointing to
        A obj;
        for(int i=0;i<1000000;i++){//if i is small it will not call the garbage collector
            obj=new A("Random name");
        }
    }


    static void swap(Integer a, Integer b){
        Integer temp=a;
        a=b;
        b=temp;
    }
}

class A{

    final int num=10;
    String name;

    public A(String name) {
        this.name = name;
    }
//java destroys class itself after use is over you cannot write a destructor for it but you can mention things you want to do whenever java calls it destructor this can be done in finalize()
    @Override
    protected void finalize() throws Throwable{
        System.out.println("Object is destroyed");
    }

}
