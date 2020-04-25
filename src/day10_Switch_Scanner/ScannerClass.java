package day10_Switch_Scanner;

import java.util.Scanner;

public class ScannerClass {

    public static void main(String[] args) {
        // Scanner variableName = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        //variableName: will be reference to scanner object

        System.out.println("enter a byte nymber");
        byte num1 = input.nextByte();

        System.out.println("You have entered " +num1);

        if(num1%2 ==0){
            System.out.println(num1+" is even number");
        }else {
            System.out.println(num1+" is odd number");
        }




    }

}
