package Recursion;

import java.util.Arrays;

public class ReverseString {
    static void swap(char[] arr, int a, int b){
        char temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    static void helper(char ch[], int index){
        if(index>=ch.length/2){
            return;
        }
        swap(ch,index,ch.length-index-1);
        helper(ch,index+1);
    }
    static String reverseString(String s){
        char[] arr = s.toCharArray();
        helper(arr,0);
        return new String(arr);
    }
    public static void main(String[] args) {
        String s = "ReverseEngineering";
        String rev = reverseString(s);
        System.out.println(rev);
    }
}
