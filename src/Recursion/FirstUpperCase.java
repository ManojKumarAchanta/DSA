package Recursion;

public class FirstUpperCase {
    static char firstUpperIter(String s){
        for(char ch:s.toCharArray()){
            if(ch>='A'&&ch<='Z') {
                return ch;
            }
        }
        return s.charAt(0);
    }
    static char firstUpperRecur(String s, int index){
        if(index>=s.length()){
            return s.charAt(0);
        }
            if(s.charAt(index)>='A'&&s.charAt(index)<='Z') {
                return s.charAt(index);
            }
        return firstUpperRecur(s,index+1);
    }

    public static void main(String[] args) {
        String s = "gEeksForGeeks";

        System.out.println(firstUpperIter(s));
        System.out.println(firstUpperRecur(s,0));
    }
}
