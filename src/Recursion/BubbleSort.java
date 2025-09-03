package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void swap(int[] arr,int a, int b){
        arr[a] = arr[a]^arr[b];
        arr[b] = arr[a]^arr[b];
        arr[a] = arr[a]^arr[b];
    }
    static void sort(int[] arr,int n){
        if(n==1){
            return;
        }
        int count =0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                swap(arr,i,i+1);
                count++;
            }
        }
        if(count==0) return;
        sort(arr,n-1);
    }
    public static void main(String[] args) {
        int[] dummy = new int[] {3,4,2,1,78,54,32};
        sort(dummy,dummy.length);
        System.out.println(Arrays.toString(dummy));
    }
}
