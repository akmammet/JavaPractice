package day12_NextPractice;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Salary_Report {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary");
        double salary = scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter your full name");
        String fullName = scan.nextLine();

        System.out.println("enter your company name");
        String companyName = scan.nextLine();

        System.out.println("Enter your SSN");
        double ssn =scan.nextDouble();

        scan.nextLine();
        System.out.println("Enter your job title");
        String jobTitle = scan.nextLine();

        System.out.println("Company name " +companyName );



    }
}
