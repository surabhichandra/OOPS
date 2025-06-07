package com.surabhi.generics;


import com.surabhi.interfaces.nested.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// T should be either Number or any subclass of it
public class WildcardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;//also working as index value
    //instance cannot be created for generic type
    // can not use generics for static data
    // overlading not allowed for generic class
    public WildcardExample(){
        this.data=new Object[DEFAULT_SIZE];
    }


    // when you dont know the datatype of WildcardExample you want to pass, then you can use this wildcard
    // if we use T then we will limit this method to take paramater of datatype T only
    public void print(WildcardExample<?> list){
        // this is an example of wildcard.
        //now you can pass any subclass of Number or Number.
        System.out.println(list.toString()+" "+list.getClass());


    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[] temp= new Object[data.length*2];
        for(int i=0;i<data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }

    private boolean isFull(){
        return size==data.length;
    }

    public T remove(){
        T removed= (T) data[--size];
        return removed;
    }

    public int size(){
        return size;
    }

    public T get(int index){
        return (T)data[index];
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
        WildcardExample<Integer> list = new WildcardExample<>();
        for(int i=0;i<15;i++)list.add(i);
        System.out.println(list);


        WildcardExample<Double> list2 = new WildcardExample<>();
        list2.add(2.2333D);
        list.print(list2);


        WildcardExample list3 = new WildcardExample<>();
        list3.add(211);
        list3.add(1.11111);
        list3.print(list3);



//        ArrayList<String> dddddCustomArrayList
    }
}
