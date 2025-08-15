package AmazonSDEPrep.prevYear;
import java.lang.Math;
public class Servers {
    public static void main(String[] args) {
        int[] power = {747,812,112,1230,1426,1477,1388,976,849,1431,1885,1845,1070,1980,280,1075,232,1330,1868,1696,1361,1822,524,1899,1904,538,731,985,279,1608,1558,930,1232,1497,875,1850,1173,805,1720,33,233,330,1429,1688,281,362,1963,927,1688,256,1594,1823,743,553,1633,1898,1101,1278,717,522,1926,1451,119,1283,1016,194,780,1436,1233,710,1608,523,874,1779,1822,134,1984};
        System.out.println(serverCache(power));
    }
    static int findMinInRange(int[] nums,int start, int end){
        int min = Integer.MAX_VALUE;
        for (int i = start; i <=end ; i++) {
            if(nums[i]<=min){
                min=nums[i];
            }
        }
        return min;
    }
    static long findSumInRange(int[] nums,int start, int end){
        long sum = 0;
        for (int i = start; i <=end ; i++) {
                sum += nums[i];
        }
        return sum;
    }
    static int serverCache(int[] power){
        int sum=0;
        for(int i=0;i<power.length;i++){
            for(int j=i;j<power.length;j++){
                sum += findMinInRange(power,i,j)*findSumInRange(power,i,j);
            }
        }
        return sum%((int)Math.pow(10,9)+7);
    }
}
