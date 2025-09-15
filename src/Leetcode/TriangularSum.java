package Leetcode;

import java.util.Arrays;

public class TriangularSum {
    public static int triangularSum(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
        while(nums.length>1){
            int k=0;
                int[] temp = new int[nums.length-1];
            for(int i=0;i<nums.length-1;i++){
//                System.out.println(nums[i]+" "+nums[i+1]);
                temp[k++]=(nums[i]+nums[i+1])%10;
//                System.out.println(temp[k-1]);
            }
                nums=temp;
            System.out.println(Arrays.toString(nums));
        }
        return nums[0];
    }
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5};
        int res = triangularSum(arr);
        System.out.println(res);
    }
}
