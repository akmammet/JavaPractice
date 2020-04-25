package day23_Methods;

import java.util.Scanner;

public class Methods_WithParameters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you age");
        int age = scan.nextInt();


        EligibleToBuyAlcohol(20);
    }


    public static void EligibleToBuyAlcohol(int age){

        if(age>=21){
            System.out.println("eligible to buy alcohol");
        } else {
            System.out.println("Eligible to buy milk");
        }

    }






}
