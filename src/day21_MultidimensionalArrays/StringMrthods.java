package day21_MultidimensionalArrays;

import java.util.Arrays;

public class StringMrthods {
    public static void main(String[] args) {
        String name = "Java";

        char[] chars = name.toCharArray();

        System.out.println(chars[0]);
        System.out.println(chars[1]);
        System.out.println(chars[3]);

        String str = "I like Java";

        String[] arr= str.split(" ");

        System.out.println(Arrays.toString(arr));
        /*
        reverse sentence: day great is today
         */
        String sentence = "Today is great day";
        String [] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        String result = "";


        for(int i =words.length-1; i >= 0; i--){

            String eachWords = words[i];
            result += eachWords+" ";
           // System.out.print(eachWords+" ");
        }
        System.out.println(result);


        String str2 = "ABCDDEFGHJKLI";
        String arr2[] = str2.split("");
        System.out.println(Arrays.toString(arr2));

    }
}
