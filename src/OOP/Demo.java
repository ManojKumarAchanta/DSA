package OOP;
class MobilePhone{
    String brand;
    int price;
    String name;
    public void show(){
        System.out.println("Name: "+name+", Brand: "+brand+", Price: "+price+"$");
    }
}
public class Demo {
    public static void main(String[] args) {
        MobilePhone mob1 = new MobilePhone();
        MobilePhone mob2 = new MobilePhone();
        mob1.name="Smart Phone";
        mob1.brand="Motorola";
        mob1.price=1000;
        mob2.name="Smart Phone";
        mob2.brand="IPhone";
        mob2.price=5000;
        mob1.show();
        mob2.show();
    }
}
