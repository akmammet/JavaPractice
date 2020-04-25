package day12_NextPractice;

import java.util.Scanner;

public class replit_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter seconds");
        int inputSeconds = scan.nextInt();
        int hours = (inputSeconds / 3600);
        int minutes = (inputSeconds%3600) / 60;
        int seconds = ((inputSeconds%3600) % 60);

        System.out.println(hours+" hours "+minutes +" minutes "+ seconds + " seconds");



              /*  //WRITE YOUR CODE HERE:
                Scanner scan = new Scanner(System.in);
                System.out.println("Enter numbe of milligrams in drink:");
                int milligrams = scan.nextInt();
                int overdose = milligrams / 25;
                System.out.println("It would take about  drinks for a lethal overdose");
*/




    }
}
