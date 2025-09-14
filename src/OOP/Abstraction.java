package OOP;

abstract class Abs{
    abstract void sound();
    void eat(){
        System.out.println("Animal eats food.");
    }
}
class InstanceHelper extends Abs{
    @Override
    void sound(){
        System.out.println("Animal makes sound");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        InstanceHelper b = new InstanceHelper();
        b.eat();
        b.sound();
    }
}
