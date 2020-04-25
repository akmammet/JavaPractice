package day20_ArraysContinue;

public class Max_MIn {
    public static void main(String[] args) {
       /*
       1. write a program that can find the maximum number from any given int array
                NOTE: DO NOT USE ANYTHING THAT WE HAVN'T COVERED IN THE CLASS
        */

       int [] arr = { 2,3,4,5,6,9,8,65,6,5};
       int lastIndex = arr.length-1;
       int max = arr[0];
       int min = arr[0];

       for(int i =0; i <= lastIndex-1; i++){

           if(arr[i] > max){
               max = arr[i];
           }

           if(arr[i] < min){
               min = arr[i];
           }

       }
        System.out.println(max);
        System.out.println(min);
    }
}
