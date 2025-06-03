package com.surabhi.staticExample;
// all the static stuff will be handeled during compile
// outside classes can not be static
public class OuterClass {
     class InnerClass {
        String name;

         public InnerClass(String name) {
             this.name = name;
         }
     }

    public static void main(String[] args) {
         OuterClass outerClass = new OuterClass();
        InnerClass t = outerClass.new InnerClass("Surabhi");
        System.out.println(t.name);

    }
}

class OuterClass2 {

    // static inner classes are not dependent on the object of class OuterClass2
    static class InnerClass {
        String name;

        public InnerClass(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass("Nitin");
        InnerClass innerClass2 = new InnerClass("Surabhi");
        // here we are making the class as static so that we can create object of this class without its parent's object
        // but the class will have its own object and all the variables and methods will be attached to that object. No static stuff inside inner class
        System.out.println(innerClass.name);
        System.out.println(innerClass2.name);



    }
}



