package day15_Loop;

import java.util.Scanner;

public class Warmup {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name");
            String firstName =scan.next();

        System.out.println("Enter your last name");
            String lastName = scan.next();
/*
        String initials = firstName.substring(0,1)+lastName.substring(0,1);
           initials= initials.toUpperCase();

        System.out.println(initials);
*/
        String initials = "" +  firstName.charAt(0) + lastName.charAt(0);
        initials=initials.toUpperCase();
        System.out.println(initials);
    }
}
