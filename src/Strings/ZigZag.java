package Strings;

import java.util.Arrays;

public class ZigZag {
    public static String convert(String s, int numRows) {
        int len = s.length();
        int cols = numRows+(len/numRows);
        char[][] matrix = new char[numRows][cols];
        int matrixLength = numRows * cols ;
        int direction = 1;
        int twoFact = 0;
        int rowStart = 0, rowEnd = matrix.length -1,n=0;
        int count = 1,i=0;
        while(count<=matrixLength && i<s.length()){
            if(direction==1){
                while(rowStart<matrix.length&&i<len){
                    matrix[rowStart][2*twoFact] = s.charAt(i);
                    count++;
                    i++;
                    rowStart++;
                }
                rowStart=0;
                twoFact++;
                direction++;
            }else{
                while(rowEnd>0){
                    matrix[rowEnd][n]=s.charAt(i);
                    rowEnd--;
                    count++;
                    i++;
                    n++;
                }
                rowEnd= numRows-1;
                direction++;
            }
            direction %= 2;
        }
        for(char[] row:matrix){
            System.out.println(Arrays.toString(row));
        }
        StringBuffer res = new StringBuffer("");
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        String res = convert(s,3);
    }
}
