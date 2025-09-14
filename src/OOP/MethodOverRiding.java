package OOP;

class Animal{
    private final String name,task;
    public Animal(String name, String task){
        this.name=name;
        this.task=task;
    }
    public void sound(){
        System.out.println(name+" is "+task+".");
    }
    public String getName(){
        return this.name;
    }
    public String getTask(){
        return this.task;
    }
}
class Dog extends Animal{
    public Dog(String name,String task){
        super(name,task);
    }
    @Override
    public void sound(){
        System.out.println(getName()+" is "+getTask()+".....");
    }
}
public class MethodOverRiding {
    public static void main(String[] args) {
        //dynamic dispatch
        Animal dog = new Dog("Tommy","Barking");
        dog.sound();

    }
}
