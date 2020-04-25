package day22_Arrays_Loops;

import java.util.Arrays;

/*
 2. write a program that sort the array in descending order
 */
public class Descending {
    public static void main(String[] args) {
        int[] arr = {1000, 20, 3, -40, 500, 60, 7, 80, 90, 100};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int[] RevArr = new int[arr.length];

        int j = arr.length - 1;

        for (int i = 0; i <= arr.length - 1; i++) {
            RevArr[i] = arr[j];
            j--;

        }
        System.out.println(Arrays.toString(RevArr));
    }
}