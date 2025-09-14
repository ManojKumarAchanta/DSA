package OOP;
import BinarySearch.BSRecursion;
class A {
    private int x;
    public int getX(){
        return x;
    }
    public void setX(int val){
        this.x = val;
    }
}
//the main of usage of getters and setters is to set and get the instance variables i.e; private variables of a class
public class AccessModifier {
    public static void main(String[] args) {
        System.out.println("From AccessModifier");
        //used getters and setters
        A obj = new A();
        int[] augNums = {89, 78, 56, 45, 34, 23, 12, 2};
//        BSRecursion br = new BSRecursion();
        int res = BSRecursion.augmentedBinarySearch(augNums,0,augNums.length,78);
        System.out.println(res);
        obj.setX(10);
        System.out.println(obj.getX());
    }
}
