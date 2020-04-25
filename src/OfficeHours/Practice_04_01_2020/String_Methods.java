package OfficeHours.Practice_04_01_2020;

public class String_Methods {

    public static void main(String[] args) {

        String str1 = "Java";

       char ch1 = str1.charAt(3);

       System.out.println(ch1);

       char ch2 = str1.charAt(2);
        System.out.println(ch2);
        System.out.println("============================================");

        String str2 ="Cybertek School";

        int total = str2.length();
        int maxIndex = str2.length() - 1; //last index number

        char ch3 = str2.charAt(maxIndex);

        System.out.println(maxIndex);
        System.out.println(ch3);

        System.out.println("============================================");

        String str3 = "Cybertek";
               str3 =  str3.concat(" School"); // "Cybertek School"
        System.out.println(str3);

        String str4 = "Mehmet";
               str4 =  str4.concat(" is from Halach"); // new string "Java is fun"
        System.out.println(str4);



        System.out.println("============================================");

        String str5 = "MEHMET ALLAKGAYEV";
                str5 = str5.toLowerCase();

        System.out.println(str5);

        String str6 = "annajemal shipayeva";
               str6 = str6.toUpperCase();

        System.out.println(str6);

        // trim(): basically trims unused(white) space from the string
        String str7 = "               Cybertek";
               str7 =  str7.trim();
        System.out.println(str7);
        System.out.println(str7.length());

        String str8 = "1     1";
               str8 =  str8.trim();

        System.out.println(str8);
        System.out.println("============================================");

        String sentence1 = "I like Java";
        String word1 =        sentence1.substring(7, 10+1); // substring Java
        String word2 =        sentence1.substring(7, sentence1.length());
        String word3 =        sentence1.substring(2, 5+1);


        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);

        System.out.println("============================================");

        String sentence2 = "I like to learn Java";

        String r1 = sentence2.substring(10); // "learn Java";
        System.out.println(r1);

        String r2 = "Java";

        String r3 = r2.substring(0,2);
        String r4 = r2.substring(2,3);
                r4 = r4.toUpperCase();
        String r5 = r2.substring(3);

        String result = r3+r4+r5;
        System.out.println(result);

        System.out.println("============================================");

        String str = "I like C#, C# is cool";
               str =  str.replace("C", "Java");
        System.out.println(str);

        String t1 = "I like Java, Java is cool";
        t1 = t1.replaceFirst("Java", "C#");
        System.out.println(t1);

        System.out.println("============================================");

        String y1 = "Today W is Wednesday";
            int a1= y1.indexOf("W");
            int a2= y1.indexOf("Wednesday");
        System.out.println(a1);
        System.out.println(a2);

        String y2 = "Cybertek School, School";
            int a3=y2.lastIndexOf("S");
        System.out.println(a3);

        System.out.println("============================================");


















    }
}
