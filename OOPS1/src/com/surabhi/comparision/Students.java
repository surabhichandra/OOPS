package com.surabhi.comparision;

public class Students implements Comparable<Students>{
    String name;
    int rollNo;
    float marks;

    public Students(String name, int rollNo, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }


    /*
        we want to compare current object with object in paramater
        if my current object is > object return >0 value
        if my current object is < objec return <0 value
        otherwise return 0
     */
    @Override
    public int compareTo(Students obj){
        if(this.marks > obj.marks)return 1;
        if(this.marks < obj.marks)return -1;
        return 0;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", marks=" + marks +
                '}';
    }
}
