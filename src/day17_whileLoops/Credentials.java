package day17_whileLoops;

import java.util.Scanner;

public class Credentials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter username");
        String username = input.next();

        System.out.println("Enter Password");
        String password = input.next();


        while (!(username.equals("cybertek") && password.equals("cybertek123"))){

            System.out.println("Please re enter your credentials");

            System.out.println("Enter username");
            username = input.next();

            System.out.println("Enter Password");
            password = input.next();

        }

        System.out.println("Logged in");



    }
}
