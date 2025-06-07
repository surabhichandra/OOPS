package com.surabhi.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomGenericArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size=0;//also working as index value
    //instance cannot be created for generic type
    // can not use generics for static data
    // overlading not allowed for generic class
    public CustomGenericArrayList(){
        this.data=new Object[DEFAULT_SIZE];
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
        CustomGenericArrayList<Integer> list = new CustomGenericArrayList<>();
        for(int i=0;i<15;i++)list.add(i);
        System.out.println(list);


        CustomGenericArrayList<String> strList = new CustomGenericArrayList<>();
        strList.add("Surabhi");
        strList.add("Nitin");
        System.out.println(strList);



//        ArrayList<String> dddddCustomArrayList
    }
}
