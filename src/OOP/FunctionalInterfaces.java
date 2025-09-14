package OOP;


//an interface with one abstarct method and
//Annotated with @FunctionalInterface

@FunctionalInterface
interface Greeting{
    void sayHello(String name);
}
public class FunctionalInterfaces {
     public static Greeting g = (n) -> System.out.println("hello "+n);
    public static void main(String[] args) {
        g.sayHello("Manoj");
        System.gc();
    }
}
