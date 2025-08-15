package Sortings;

import java.util.Arrays;

public class SelectionSort {
    static int getMaxIndex(int[] arr,int start, int end){
        int max = start;
        for (int i = start; i <= end; i++) {
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    static void selection(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            //find the maxitem in the remianing array and swap with correvt index
            int last =  arr.length-i-1;
            int maxIndex = getMaxIndex(arr, 0,last);
            swap(arr, last,maxIndex);
        }
    }
    public static void main(String[] args) {
            int[] arr  = {4,1,2,-45,0,-432};
            selection(arr);
            System.out.println(Arrays.toString(arr));
    }
}
