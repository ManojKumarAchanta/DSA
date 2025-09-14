package OOP;

public class MethodOverloading {
    public void show(String item){
        System.out.println("1 item ----"+item);
    }
    public void show(String item1,String item2){
        System.out.println("2 items ----?"+item1+", "+item2+".");
    }
    public String show(String item1,String item3, String item2){
        return item1+" "+item2+" "+item3;
    }

    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        mo.show("Car");
        mo.show("Car","BMW");
        System.out.println(mo.show("Car","BMW","i5"));
    }
}
