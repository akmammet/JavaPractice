package day22_Arrays_Loops;

import java.util.Arrays;

public class Multi_DArrays {
    public static void main(String[] args) {
        int[] arr = {1000, 20, 3, -40, 500, 60, 7, 80, 90, 100};


        int[][] arr2D = {{1000, 20, 3}, {-40, 500, 60, 7, 80, 90, 100}};

        int[] arr1D = arr2D[0];
        System.out.println(Arrays.toString(arr1D));
        System.out.println(Arrays.toString(arr2D[0]));
        System.out.println(arr2D[0][2]);
        System.out.println(Arrays.deepToString(arr2D));

        for( int eachElement : arr2D[0]){
            System.out.println(eachElement);
        }

        for(int i=0; i < arr2D[0].length;i++ ){
            int num = arr2D[0][i];
            System.out.println(num);
        }
    }
}
