package Strings;

public class Output {
    public static void main(String[] args) {
        //when you try to print any thing using println it will call valueOf()=>toString() method        System.out.println(56);
        System.out.println("Manoj Kumar");
        System.out.println(new int[] {1,2,3,4,5});
        String name = null;
        System.out.println(name);
        String series = "";
        for(int i=0;i<26;i++){
            char ch = (char)('a'+i);
            System.out.println(ch);
            series += ch;
        }
        System.out.println(series);
    }
}
