package day22_Arrays_Loops;

import java.util.Arrays;

public class Reverse_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        for(int i = arr.length-1; i >= 0; i--){
           int eachNum =  arr[i];
            System.out.println(eachNum);
        }
        System.out.println("=============================================");

        int[] RevArr = new int[arr.length]; // [0,0,0,0,0]


        int j = arr.length-1;

        for ( int i = 0; i <=arr.length-1; i++){
            RevArr[i] = arr[j];
            j--;

        }
        System.out.println(Arrays.toString(RevArr));
    }
}
