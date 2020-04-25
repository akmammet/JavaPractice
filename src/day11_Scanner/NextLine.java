package day11_Scanner;

import java.util.Scanner;

public class NextLine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the full name: ");
        String fullName = input.nextLine();

        System.out.println("your full name is: "+fullName);

        System.out.println("Enter your love sentence: ");
        String sentence = input.nextLine();

        System.out.println("Your love sentence is: "+sentence);
        System.out.println(fullName+" "+sentence);

    }
}
