package OOP;
interface Vehicle {
    void drive(); // abstract
}
interface Zeep extends Vehicle{
    void drive();
    //static interface methods should always have a body
    static void greet(){
        System.out.println("Greeting from zeep");
    }
    default void fun(){
        System.out.println("I'm in zeep");
    }
}
class Car implements Vehicle,Zeep {
    public void drive() {
        System.out.println("Car is driving");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        Zeep car = new Car();
        car.drive();
        ((Zeep)car).fun();
        Zeep.greet();
    }
}
