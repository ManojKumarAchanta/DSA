package Generics;

import java.util.Arrays;
import java.util.*;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE=10;
    private int size = 0;
    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }
    //the below is the wild card
    //when you want to pass Any type of list into the function use Question ? extends Number rather List<Number>
    public void getList(List<? extends Number> list){
        //do something
        return;
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length * 2];
        //copy current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i]= data[i];
        }
        data = temp;
    }
    public T remove(){
                T removed = (T)(data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index,T value){
        data[index]=value;
    }
    @Override
    public String toString(){
        return "CustomArrayList{"+"data="+ Arrays.toString(data)+", size="+size+'}';
    }
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
        WildcardExample<Integer> list = new WildcardExample<Integer>();
//        list.add(2);
//        list.add(3);
//        list.add(5);
        for (int i = 0; i < 14; i++) {
            list.add(2*i);
        }
        System.out.println(list);
        System.out.println(list.size());
    }
}
