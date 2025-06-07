package com.surabhi.comparision;

import java.util.ArrayList;

public class LambdaFunction {
    // lambda functions are inline function, which has 1 line

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<10;i++)arr.add(i);
        arr.forEach((item)-> System.out.println(item * 2));
    }
}
