package Recursion;

public class ProductOfTwoNumbers {
    public static int product(int a, int b){
        if(b==0) return 0;
        return a+product(a,b-1);
    }
    public static void main(String[] args) {
        int x = 5, y=2;
        int a = 100,b=5;
        System.out.println(product(x,y));
        System.out.println(product(a,b));
    }
}
