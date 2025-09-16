package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ReplaceCoprime {
    public static int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a%b);
    }
    public static boolean coPrime(int x, int y){
        return gcd(x,y)==1;
    }
    public static int lcm(int x, int y){
        return (x*y)/gcd(x,y);
    }
    public static List<Integer> replaceNonCoprimes(int[] nums) {
        List<Integer> list = new ArrayList<>();
        // int i=0;
        Stack<Integer> stack = new Stack<>();
        stack.push(nums[0]);
        for(int i=1;i<nums.length;i++){
            int val=0;
            if(!coPrime(stack.peek(),nums[i])){
                int peekValue = stack.peek();
                stack.clear();
                if(!list.contains(peekValue)){
                    list.add(lcm(peekValue,nums[i]));
                }
                stack.push(lcm(peekValue,nums[i]));

            }else{
                list.add(nums[i]);
                list.add(stack.peek());
                stack.clear();
                stack.push(nums[i+1]);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {6,4,3,2,7,6,2};
        List<Integer> res = replaceNonCoprimes(nums);
        System.out.println(res);
    }
}
