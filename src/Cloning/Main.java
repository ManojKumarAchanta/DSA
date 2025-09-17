package Cloning;

import java.util.Arrays;

public class Main  {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human human = new Human(20,"Manoj Kumar");
        //shallow copy
        Human twin = (Human)human.clone();
        System.out.println(twin.age+"  "+twin.name);
        System.out.println(Arrays.toString(human.arr));

        twin.arr[0] = 100;
        System.out.println(Arrays.toString(twin.arr));
        System.out.println(Arrays.toString(human.arr));
    }
}
