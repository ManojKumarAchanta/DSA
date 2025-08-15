package Sortings;

import java.util.Arrays;

public class InsertionSort {
    static void swap(int[] nums, int a, int b){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    static void insertionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (nums[j] < nums[j - 1]) {
                    swap(nums, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
