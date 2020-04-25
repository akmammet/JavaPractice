package day13_StringClass;

import java.util.Scanner;

public class String_Manipulations3 {
    public static void main(String[] args) {
        String str = "I like Java programming";

        int num1 = str.indexOf("J");
        System.out.println(num1);

        String str2 = " My name is akmammet from Halach, fuck";
        int firstA = str2.indexOf("a");
        int secondA = str2.indexOf("Halach") + 1;

        System.out.println(firstA);
        System.out.println(secondA);

        int maxIndexNumber = "Cybertek".length() - 1;

        String names = "Muhtar";
        int nme1 = names.indexOf("Good Guy");
        System.out.println(nme1);

        String fullName = "Akmammet Allakgayev";
        String firstName = fullName.substring(0, fullName.indexOf(" "));
        String lastName = fullName.substring(fullName.indexOf(" ") + 1);

        System.out.println(firstName);
        System.out.println(lastName);


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = scan.next();


        String firstName1 = email.substring((0), email.indexOf("_"));
        String lastName1 = email.substring(email.indexOf("_")+1, email.indexOf("@"));
        String email1 = email.substring(email.indexOf("@"));

        if(email.contains("_")){
        System.out.println(lastName1 + "_" + firstName1 + email1);
        }else{
            System.out.println(email);
        }
    }
}