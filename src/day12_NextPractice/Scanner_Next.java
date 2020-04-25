package day12_NextPractice;

import java.util.Scanner;

public class Scanner_Next {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

           // String str = input.next();
       // System.out.println(str);

        String fullAddress = "";

        System.out.println("Enter the number of the building: ");
            short bNumber = input.nextShort();
                fullAddress += bNumber+" ";

        System.out.println("Enter the Street name: ");
        String streetName = input.next();
        fullAddress += streetName+" ";

        input.nextLine();

        System.out.println("Enter the type of the road: ");
        String roadType = input.next();
        fullAddress += roadType+", ";

        System.out.println("Enter city name, State, Zip code");
        String cityName = input.next();
        fullAddress += cityName+" ";

        String state = input.next();
        fullAddress += state+ ", ";

        int zipCode = input.nextInt();
        fullAddress += zipCode;

        System.out.println("Address is " + fullAddress);


    }
}
