package Strings;

public class Main {
    public static void main(String[] args) {
        String a="Manoj";
        String b="Manoj";
        String c=new String("Manoj");
        String d=new String("Manoj");
//        b="kushwaha";
//        == checks if reference variables are pointing to same object
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(c.equals(d));
        System.out.println(a.equals(b));
        System.out.println(a==b);
        System.out.println(c==d);
    }
}
