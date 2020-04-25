package day12_NextPractice;

import java.util.Scanner;

public class Scanner_Nextline_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Building Number: ");
        int bNumber = input.nextInt();
      //  System.out.println("Building number is: "+bNumber);

        input.nextLine();//6248

        System.out.println("Street: ");
        String street = input.nextLine();
        System.out.println("Street is: "+street);

        System.out.println("Enter the zip code: ");
        int zipCode = input.nextInt();
        input.nextLine();

        System.out.println("Enter the city name and state separated by comma and space");
        String cityState = input.nextLine();

        String fullAddress = bNumber+" "+street+", "+cityState+" "+zipCode;
        System.out.println("Your full address is: "+fullAddress);


    }
}
