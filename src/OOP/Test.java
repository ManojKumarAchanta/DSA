package OOP;

class Calculator{
     int num = 5;
    public  void add(int x, int y){
        System.out.println("Hello from Calculator");
        num = x + y;
        System.out.println(num);
    }
}
public class Test {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Calculator obj1 = new Calculator();
        obj.num=6;

        System.out.println(obj1.num);
        obj.add(3,4);
        obj1=obj;
        System.out.println(obj1.num);
        obj1.add(3,8);
    }
}
