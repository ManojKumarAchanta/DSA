package Recursion;

public class MinMaxUsingRecursion {
    static int findMin(int[] arr, int n){
        if(n==1) return arr[0];
        int min = findMin(arr,n-1);
        return Math.min(arr[n - 1], min);
    }
    static int findMax(int[] arr, int n){
        if(n==1) return arr[0];
        int max = findMax(arr,n-1);
        return Math.max(arr[n - 1], max);
    }
    public static void main(String[] args) {
        int[] x={4,5,6,7,2,1,3,5};
        int min = findMin(x,8);
        int max = findMax(x,8);
        System.out.println(min+" "+max);
    }
}
