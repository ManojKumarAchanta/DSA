package Math;

public class SingleElement {
    public static void main(String[] args) {
        int[] nums={2,2,3,4,3,5,4};
        int xor=0;
        for(int num:nums){
            xor^=num;
        }
        System.out.println(xor);

    }
}
