package day14_StringClass;
/*
userName : cybertek
passWord : cyber123/
         */


import java.util.Scanner;
public class Credentials {
    public static void main(String[] args) {
       String validUserName = "cybertek";
       String validPassWord = "cyber123/";


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username");
        String inputUsername = scan.next();
        System.out.println("Enter your password");
        String inputPassword = scan.next();

        boolean validCredentials = (validUserName.equals(inputUsername) && validPassWord.equals(inputPassword));

        if(validCredentials){

            System.out.println("Log in Successful");

        } else {
            System.out.println("Invalid username or password");
        }

    }
}
