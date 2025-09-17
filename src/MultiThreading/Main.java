package MultiThreading;

class A extends  Thread{
    public  void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hi");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends  Thread{
    public  void run(){
        for(int i=1;i<=100;i++){
            System.out.println("Hello");
            try {
                sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A();
        B b = new B();
        a.start();
        Thread.sleep(5);
        b.start();
    }
}
