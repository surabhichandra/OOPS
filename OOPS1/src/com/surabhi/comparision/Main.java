package com.surabhi.comparision;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Students s1 = new Students("Surabhi", 05, 91.5f);
        Students s2 = new Students("Nitin", 23, 95.5f);
        Students s3 = new Students("Surabhi", 05, 99.5f);
        // by default if you use == operator it will compare the reference. Means address
        System.out.println(s1 == s3);
        System.out.println(s1 == s2);
        Students s4 = s1;
        System.out.println(s1 == s4);

        // you can not compare object direclty using > <
        if (s1.compareTo(s2) > 0) {
            System.out.println("Surabhi has more marks");
        } else if (s1.compareTo(s2) < 0) {
            System.out.println("Nitin has more marks");
        } else {
            System.out.println("Both have same marks");
        }

        // if you sort the students , java will automatically use compareTo method
        Students[] students ={s1,s2,s3,s4};
        Arrays.sort(students);
        for(Students s : students){
            System.out.println(s.toString());
        }
        // you can either use comparable or comparator to sort objects
        // in comparable, you need to override comareTo in the class in which you are impelmenting it
        // in comparator, you need to pass an comparator object which must define comapare method which is also an interface
        Comparator<Students> c1 = new Comparator<Students>() {
            @Override
            public int compare(Students o1, Students o2) {
                return o1.rollNo - o2.rollNo;
            }
        };
        Arrays.sort(students,c1);

        System.out.println();

        for(Students s : students){
            System.out.println(s.toString());
        }
        // this is same as above
        Arrays.sort(students, (a,b)->(a.rollNo - b.rollNo) );


    }



}