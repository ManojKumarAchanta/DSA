package ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try{
//            int c = a / b;
//            divide(a,b);
//            throw new Exception("Just for fun");
            String name="Manoj";
            throw new MyException("name is Manoj");
        }catch(MyException | ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Normal Exception");
        }finally{
            System.out.println("I always execute");
        }

    }
    public static int divide(int a, int b) throws ArithmeticException {
        if(b==0){
            throw new ArithmeticException("Plz do not divide by zero");
        }
        return a/b;
    }
}
