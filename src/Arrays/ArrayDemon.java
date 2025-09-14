package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDemon {
    public static void main(String[] args) {
        int[][] multiDimensional = new int[][] {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for(int[] row:multiDimensional)
            System.out.println(Arrays.toString(row));
        List<List<Integer>> multiDimesionList = new ArrayList<>();
        for(int i=0;i<3;i++){
            multiDimesionList.add(new ArrayList<>());
        }
        System.out.println(multiDimesionList.size());
        //jagged array
        int[][] jaggedArray = new int[3][];
        jaggedArray[0]=new int[2];
        jaggedArray[1]=new int[3];
        jaggedArray[2]=new int[4];
        for(int[] r:jaggedArray){
            System.out.println(Arrays.toString(r));
        }
    }
}
