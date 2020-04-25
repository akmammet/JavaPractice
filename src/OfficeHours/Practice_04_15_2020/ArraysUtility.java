package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {
        int[] arr= {9,10,8,65,8,6,5,45,87,88,12,58,1000};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int[] salaries ={500,5500,6500,8000,12000,15000,3000, 19000};
        int length =salaries.length;
        int lastIndex = length-1;
        Arrays.sort(salaries); // ascending
        System.out.println(Arrays.toString(salaries));
        System.out.println("Minimum salary: "+salaries[0]);
        System.out.println("Maximum salary: "+salaries[lastIndex]);
        System.out.println("========================================");

        int[] array1 = {1,3,2 };
        int[] array2 = {2,1,3 };

        Arrays.sort(array1);
        Arrays.sort(array2);

        System.out.println(Arrays.equals(array1,array2));

    }

}
