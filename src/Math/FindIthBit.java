package Math;

public class FindIthBit {
    static int findIthBitOfANumber(int binary, int n){
        return (binary&(1<<n))!=0?1:0;
    }
    static int setIthBit(int binary, int n){
        return binary | (1<<n);
    }
    static int resetIthBit(int binary, int n){
        return binary | (1<<n);
    }
    public static void main(String[] args) {
        int binary = 0b10101;
        System.out.println(findIthBitOfANumber(binary, 1));
         binary  =     setIthBit(binary, 1);
        System.out.println(Integer.toBinaryString(binary));
    }
}
