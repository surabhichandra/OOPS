package com.surabhi.staticExample;

public class Singleton {

    public static void main(String[] args) {

            Database obj1 = Database.getDBInstance();
            Database obj2 = Database.getDBInstance();
            Database obj3 = Database.getDBInstance();
        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);
        System.out.println(obj1==obj2);
        System.out.println(obj2==obj3);

    }




}
/*
how to create singleton class
1. constructor should be private so nobody outside can create their own object
2. you delclare a static object as a variable in the class,
3. you define a getInstance method so that outside people can get the same instance of the singleton class
Note: we make object of class static so that it is shared between people who want it, and to return this static variable we must have a static method
Note: we make private obj so that nobody can do Database.obj = null
 */
class Database {
    private static int x = 5;
    private Database() {
        System.out.println("Private constructor of Database");
    }
    private static Database obj;
    public static Database getDBInstance(){
        if(obj == null){
            obj   = new Database();
        }
        return obj;

    }

}