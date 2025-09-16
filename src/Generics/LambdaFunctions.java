package Generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        //1st way
        list.forEach((item)-> System.out.println(item*2));
        //2nd way
        Consumer<Integer> fun = (item)-> System.out.println(item*2);
        list.forEach(fun);
        //else you can create am interface of type consumer and provide implemtnation through lambda funtcions
        Operation sum = (a,b)-> a+b;
        Operation diff = (a,b)-> a-b;
        Operation product = (a,b)-> a*b;
        Operation div = (a,b)-> a/b;
        LambdaFunctions lb = new LambdaFunctions();

        System.out.println(lb.operate(10,5,sum));
        System.out.println(lb.operate(10,5,diff));
        System.out.println(lb.operate(10,5,product));
        System.out.println(lb.operate(10,5,div));


    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
    public static int sum(int a, int b){
        return a+b;
    }
    public interface Operation{
        public int operation(int a, int b);
    }
}

