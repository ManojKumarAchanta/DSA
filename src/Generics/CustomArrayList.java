package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[] data;
    private static int DEFAULT_SIZE=10;
    private int size = 0;
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }
    private boolean isFull(){
        return size==data.length;
    }
    private void resize(){
        int[] temp = new int[data.length * 2];
        //copy current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data = temp;
    }
    public int remove(){
        return data[--size];
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index,int value){
        data[index]=value;
    }
    @Override
    public String toString(){
       return "CustomArrayList{"+"data="+ Arrays.toString(data)+", size="+size+'}';
    }
    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
        CustomArrayList list = new CustomArrayList();
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
