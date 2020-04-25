package day17_whileLoops;

import java.util.Scanner;

public class WarmUp {
    public static void main(String[] args) {
      /*
      1. write a program that can ask the user "enter a number" five
      times and return the maximum number
				hint: you will need for loop and if statement

       */

        Scanner scan = new Scanner(System.in);
        int maxNumber = -2147483647; // any number user provides will be greater than this num
        int minNumber = 2147483647;

        for( int i=1; i<6; i++) {
            System.out.println("Enter a number");
            int num = scan.nextInt();
            if(num>maxNumber){
                maxNumber = num;
            }
            if(num<minNumber){
                minNumber=num;
            }


        }
        System.out.println(maxNumber);
        System.out.println(minNumber);


    }
}
