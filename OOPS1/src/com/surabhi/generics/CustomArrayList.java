package com.surabhi.generics;

import com.surabhi.interfaces.nested.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;//also working as index value

    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }

    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[] temp= new int[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull(){
        return size==data.length;
    }

    public int remove(){
        int removed=data[--size];
        return removed;
    }

    public int size(){
        return size;
    }

    public int get(int index){
        return data[index];
    }

    public void set(int index, int value){
        data[index]=value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
//        list.add(45);
//        list.remove(0);
//        list.get(0);
//        list.set(1,6789);
//        list.size();
//        list.isEmpty();
        CustomArrayList list = new CustomArrayList();
        for(int i=0;i<15;i++)list.add(i);
        System.out.println(list);

        ArrayList a1 = new ArrayList();
        List s2 = new ArrayList();



//        ArrayList<String> dddddCustomArrayList
    }
}
