package day11_Scanner;
/*
write a program that can calculate the salary after tax
                needed informations:
                                employee' salaray
                                state tax
                                federal tax
 */
import java.util.Scanner;

public class Practice_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // scanner object

        System.out.println("Enter your salary");
        int salary = input.nextInt();

        System.out.println("enter the state tax: ");
        byte stateTax = input.nextByte();
        double stateTaxPercentage = stateTax / 100.0;

        System.out.println("Enter the federal tax");
        byte federalTax = input.nextByte();
        double federalTaxPercentage = federalTax / 100.0;

        // totalTax = (federalTaxPercentage + stateTaxPercentage) * Salary
        double totalTax = (federalTaxPercentage + stateTaxPercentage) * salary;

        // salaryAfterTax = salary - totalTax
        double salaryAfterTax = salary - totalTax;
        double monthlySalary = salaryAfterTax / 12;
        System.out.println("Your salary after tax is: $" + salaryAfterTax);
        System.out.println("Your monthsly salary is: $"+monthlySalary);


    }
}