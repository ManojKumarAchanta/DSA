package Recursion;

import java.util.Arrays;

public class SumTriangle {
    static void printTriangle(int[][] tri, int x, int[] nums){
        tri[x]=nums;
        if(nums.length==1){
            return;
        }
        int[] temp = new int[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
            temp[i] = nums[i] + nums[i + 1];
        }
        printTriangle(tri,x+1,temp);
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[][] tri = new int[nums.length][];
        printTriangle(tri,0,nums);
        for(int[] row:tri){
            System.out.println(Arrays.toString(row));
        }
    }
}
