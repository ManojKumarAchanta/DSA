package MultiThreading;

import static java.lang.Thread.sleep;


class BX implements  Runnable{
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
public class ThreadUsageExample {
    public static void main(String[] args) throws InterruptedException {
        Runnable a =()->{
                    for (int i = 1; i <= 5; i++) {
                        System.out.println("Hi");
                        try {
                            sleep(10);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
        };
        Runnable b = ()->{
            for (int i = 1; i <= 5; i++) {
                System.out.println("Hello");
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };
        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);
        t1.start();
        t2.start();
    }
}
