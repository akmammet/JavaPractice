package day10_Switch_Scanner;
/*
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
 */
import java.util.Scanner;
public class Scanner_Practice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you first number");
            short num1 = input.nextShort();
        System.out.println("Enter you second number");
            short num2 = input.nextShort();
        System.out.println("the sum of those two number are: "+(num1+num2));
    }
}
