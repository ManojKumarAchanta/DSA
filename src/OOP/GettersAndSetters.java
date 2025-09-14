package OOP;


class GetSet{
    private int x;
    public int getX(){
        return this.x;
    }
    public void setX(int x){
        this.x = x;
    }
}
public class GettersAndSetters {
    public static void main(String[] args) {
        GetSet gs = new GetSet();
        gs.setX(10);
        System.out.println(gs.getX());
    }
}
