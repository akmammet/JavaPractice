package day21_MultidimensionalArrays;

import java.text.DecimalFormat;

public class AverageNumber {
    public static void main(String[] args) {
        DecimalFormat DF =new DecimalFormat("0.00");

        int [] arr ={10,20,30,40,50,70,80,90,150,450,1000,12};
        int length = arr.length;
        int sum = 0;

        for(int i = 0; i<= arr.length-1; i++){
            int eachNum = arr[i];
            sum+= eachNum;
        }
        int average = sum/length;


        System.out.println(sum);
        System.out.println(DF.format(average));


    }

}
