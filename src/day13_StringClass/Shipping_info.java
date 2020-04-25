package day13_StringClass;

import java.util.Scanner;

/*
write a program for the shipping info that, the program should ask:
					building number
					Street address (Assume it has more than one word)
					city name
					state name
					zip code
					full name of the person:
			and prints the ship to info in the following format:
			ex output:
					Ship To:  Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
 */
public class Shipping_info {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your building number");
        String buildingNumb = scan.next(); //112A
        scan.nextLine();

        System.out.println("Enter you street address");
        String streetAddress = scan.nextLine();
        //scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();
        //scan.nextLine();

        System.out.println("Enter State Name");
        String state = scan.next();
        scan.nextLine();

        System.out.println("Enter your Zip code");
        int zipCode = scan.nextInt();
        scan.nextLine();

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("Ship To:" +fullName+"\n\t\t"+buildingNumb+" "+streetAddress+"\n\t\t"+state+", "+state+" "+zipCode)            ;



    }
}
