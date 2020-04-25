package day14_StringClass;


import java.util.Scanner;

public class Credentials2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your username");
        String inputUsername = input.next();

        System.out.println("enter you password");
        String inputPassword = input.next();

        boolean loggedIn = inputUsername.equals("Cybertek") && inputPassword.equals("cybertekschool");
    }
       /* if( !inputUsername.isEmpty() && !inputPassword.isEmpty()){ // username n password not empty
            if( loggedIn) {
                System.out.println("Logged in");
        }
*/
    }

