package day14_StringClass;



import java.util.Scanner;

/*
3. Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
 */
public class MiddleCharacter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");

        String word = scan.next();


        String middleCharacter = "";
        int totalChars = word.length();
        int middleNumber = totalChars/2; // 8/2 = 4

        if(totalChars % 2 != 0){ // odd numbers

            // middleCharacter += word.charAt( middleNumber );
            middleCharacter = middleCharacter + word.charAt( middleNumber );

        }else{  // even number
            // middleCharacter = middleCharacter + word.charAt(middleNumber -1)+word.charAt( middleNumber );

            middleCharacter +=  word.charAt(middleNumber - 1)+"" + word.charAt(middleNumber);
            /// any thing we added to a string will return it as string

        }

        System.out.println("Middle character: "+middleCharacter);



    }
}
