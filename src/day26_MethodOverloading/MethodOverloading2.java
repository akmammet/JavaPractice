package day26_MethodOverloading;

import java.util.Arrays;

public class MethodOverloading2 {

    public static void main(String[] args) {
        sum2Numbers(10,5);
        sum3Numbers(10,5,15);
        sum4Numbers(10,5,15,30);

        sum(10,5);
        sum(15,30,50);
        sum(12,34,56,78);

        int[] arr1 = {3,2,1};
        char[] arr2 = {'a','c','d','k'};
        //String arr3 = {"10","6", "68"};

        Arrays.sort(arr1);
        Arrays.sort(arr2);
       // Arrays.sort(arr3);





    }


    public static void sum2Numbers(int a, int b) {
        System.out.println(a+b);
    }
    public static void sum3Numbers(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    public static void sum4Numbers(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }

    //**********************************************************************************
    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    public static void sum(int a, int b, int c, int d) {
        System.out.println(a + b + c + d);
    }
}
