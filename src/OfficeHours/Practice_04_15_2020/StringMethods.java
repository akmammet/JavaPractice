package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        String str = "Cybertek";
        char[] ch1 = str.toCharArray();

        System.out.println(str.length()== ch1.length);

        String str1 ="ABX";
        String str2 ="XBA";

        char[] ch2 = str1.toCharArray();
        char[] ch3 = str2.toCharArray();

        System.out.println(Arrays.equals(ch2,ch3));

        System.out.println("======================================================");

        String sentence = "I like to learn Java on my own when I am alone in th night";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        int totalWords = words.length;
        System.out.println(totalWords);
        String result ="";

        for(int i = totalWords-1; i>=0; i--){
            System.out.print(words[i]+" ");
            result+=words[i]+" ";
        }
    }
}
