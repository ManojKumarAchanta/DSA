package Sortings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CyclicSort {
    static void swap(int[] nums,int start, int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
    static int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length){
            if(nums[i]>nums.length-1){
                i++;
            }
            if(i!=nums[i]){
                swap(nums,i,nums[i]);
            }else{
                i++;
            }
        }
        int missing = 0;
        for(int k=0;k<nums.length;k++){
            if(nums[k]!=k){
                missing = nums[k];
                break;
            }
        }
        return missing;
    }
    static void cyclicSort(int[] nums){
        int i=0;
        while(i<nums.length){
            if(i!=nums[i]-1){
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }
        }
    }
    static List<Integer> disappearingNumbers(int[] nums){
        int i=0;
        while(i<nums.length){
            if(nums[i]<nums.length && i!=nums[i]-1){
                swap(nums,i,nums[i]-1);
            }else{
                i++;
            }
        }
        System.out.println(Arrays.toString(nums));
        List<Integer> missing = new ArrayList<>();
        for (int j = 0; j < nums.length ; j++) {
            if(j!=nums[j]){
                missing.add(j);
            }
        }
        return missing;
    }
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
//        cyclicSort(arr);
//        System.out.println(missingNumber(arr));
        System.out.println(disappearingNumbers(nums));
    }
}
