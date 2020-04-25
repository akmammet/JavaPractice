package day14_StringClass;
/*
1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
 */
import java.util.Scanner;

public class combineTwoString {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("enter first word");
        String word1 =scan.next();

        System.out.println("enter second word");
        String word2= scan.next();

        String result = word1.concat(word2).concat(word2).concat(word1);
        System.out.println(result);
    }
}
