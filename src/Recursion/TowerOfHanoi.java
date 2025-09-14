package Recursion;

public class TowerOfHanoi {
    public static void towerOfHanoi(int n, char source, char destination, char aux){
        if(n==0) return;
        towerOfHanoi(n-1,source,aux,destination);
        System.out.println("Moving Disk "+n+" from rod "+source+" to rod "+destination);
        towerOfHanoi(n-1,aux,destination,source);
    }
    public static void main(String[] args) {
        towerOfHanoi(3,'A','B','C');
    }
}
