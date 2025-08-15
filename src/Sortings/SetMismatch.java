package Sortings;

import java.util.Arrays;

class SetMismatch {
    static void swap(int[] nums,int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    static int[] findErrorNums(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct = nums[i]-1;
            if(i!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        int missing = 0, duplicate = 0;

        for(int k=0;k<nums.length;k++){
            if(nums[k]-1!=k){
                missing = k+1;
                duplicate = nums[k];
            }
        }
        return new int[] {missing,duplicate};
    }

    public static void main(String[] args) {
        int[] nums={1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}
