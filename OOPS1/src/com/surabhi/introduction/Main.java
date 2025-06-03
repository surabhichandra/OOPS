package com.surabhi.introduction;

public class Main {
    public static void main(String[] args) {
        //store 5 roll nos
        int[] numbers=new int[5];

        //store 5 names
        String[] names=new String[5];

        //dat aof 5 students: {roll no, name, marks}
        int[] rno=new int[5];
        String[] name= new String[5];
        float[] marks= new float[5];

        Student[] students=new Student[5];


        Student surabhi=new Student();
//the below code can be done using constructor and constructor will be replaced by overriden code below
//        surabhi.rno=13;
//        surabhi.name="Surabhi Chandra";
//        surabhi.marks=100;

        System.out.println(surabhi.rno);
        System.out.println(surabhi.name);
        System.out.println(surabhi.marks);
        surabhi.changeName("susu");
        surabhi.greeting();

        Student random=new Student(surabhi);
        System.out.println(random.name);

        Student arpit= new Student(17,"Arpit",89.7f);
        System.out.println(arpit.name);

        Student random2=new Student();
        System.out.println(random2.name);

        Student one=new Student();
        Student two=one;
        //on changing one two will also be changed as two is not a seperate copy it is pointing to the same obj as one
        one.name="Something Something";
        System.out.println(two.name);
    }

}
//create a class
class Student{
    int rno;
    String name;
    float marks;
//    float marks=90;//initalise default

    void greeting(){
        System.out.println("Hello! My name is "+this.name);//name will also work without this keyword
    }

    void changeName(String name){
        this.name=name;
    }

    Student (Student other){
        this.name=other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }

//    Student(){
//        this.rno=13;
//        this.name="Surabhi Chandra";
//        this.marks=88.5f;
//    }

    //to call a constructor from another constructor
    //internally: new Student(13,"default person",100);
    /*
        -- this() is used to call another constructor of same class
        -- you can do constructor chaining to remove code duplicacy
        -- this() has to be the 1st line in the constructor and you can only use this() once per constructor.
     */
    Student(){
        this(13);
        System.out.println("default contructor");
    }

    Student(int rno){
        this(rno, "Nitin",69);
        System.out.println("rno contructor");
    }

    //Student arpit= new Student(17,"Arpit",89.7f);

    Student(int rno, String name, float marks){
        this.rno=rno;
        this.name=name;
        this.marks=marks;
        System.out.println("all contructor");
    }
}
