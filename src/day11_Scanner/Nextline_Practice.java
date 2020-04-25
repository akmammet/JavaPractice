package day11_Scanner;

import java.util.Scanner;

public class Nextline_Practice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = input.nextInt(); // 30+ enter

        System.out.println("Your afe is: "+age);

        input.nextLine(); // takes out Enter2

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.println("Your full name is: "+fullName);



    }
}
