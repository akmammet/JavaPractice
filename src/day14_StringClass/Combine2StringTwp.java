package day14_StringClass;

import java.util.Scanner;

/*
2. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana

 */
public class Combine2StringTwp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter your first word" );
        String word1 = scan.next();
               word1= word1.substring(1);

        System.out.println("Enter your second word");
        String word2 = scan.next();
               word2= word2.substring(1);

        String result = word1+word2;
        System.out.println(result);

    }

}
