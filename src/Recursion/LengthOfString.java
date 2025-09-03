package Recursion;

public class LengthOfString {
    static int len(String s, int index){
        if(s==null|| s.isEmpty()) return 0;
        if(index>=s.length()) return 0;
        return 1 + len(s,index+1);
    }

    public static void main(String[] args) {
        String name = "Manoj Kumar Achanta";
        System.out.println(len(name,0));
    }
}
