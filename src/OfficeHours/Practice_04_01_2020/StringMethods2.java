package OfficeHours.Practice_04_01_2020;

public class StringMethods2 {
    public static void main(String[] args) {
        // isEmpty(): chacks if the String is empty, return boolean
        String str1 = "   ";

        boolean r1 =    str1.isEmpty();
        boolean r2 =   !str1.isEmpty();

        System.out.println(r1);
        System.out.println(r2);

        System.out.println("==========================================================");

        //equals(str): checks if the two string texts are equal or not

        String s1 ="cat";
        String s2 = new String("cat");
        String s3 = "Cat";

        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));


        System.out.println("==========================================================");

        //contains(str): check if the given is included in the string

        String sentence = "I like to sleep with you";
        System.out.println(sentence.contains("to"));

        String sentence2 = "Top 3 viruses are: 1. Corona, 2. Hanta, 3. Ebola";

        System.out.println(sentence2.contains("Corona"));

        System.out.println("==========================================================");

        String webAddress = "www.limited77.com";
        System.out.println(webAddress.startsWith("www"));
        System.out.println(webAddress.startsWith("wWw"));

        String gmail ="Pesti89@gmail.com";
        System.out.println(gmail.endsWith("@gmail.com"));
        System.out.println(gmail.endsWith("@hotmail.com"));


    }
}
