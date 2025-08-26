package Strings;

public class Palindrome {
    static boolean isPalindrome(String name){
        if(name==null || name.length()==0){
            return true;
        }
        for (int i = 0, j=name.length()-1; i < j; i++,j--) {
            if(name.charAt(i)!=name.charAt(j)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String name=null;
        System.out.println(isPalindrome(name));
    }
}
