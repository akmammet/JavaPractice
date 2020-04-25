package day13_StringClass;

public class String_manipulations {
    public static void main(String[] args) {

        String str = "Cybertek";
        //              01234567

        char ch1=    str.charAt(5);
        System.out.println(ch1);

        int totalLength = str.length(); // returns number of characters as int
        System.out.println(totalLength > 250);

        String str2 ="Today is great day, java id Fun";
        int maxIndexNumb = str2.length() - 1;
        System.out.println(maxIndexNumb);

        String s1 = "Cybertek";
           s1 = s1.concat(" School"); // "Cybertek School"

        System.out.println(s1);

        String s2 = "Halachly menem";
        System.out.println(s2.concat(" sen, nirden dos?"));

        System.out.println(s2);
        s2 = s2.concat(" , sen, nirden dos???");

        String r1 = "Java is fun";
             r1 =   r1.concat(", and it's easy");

        System.out.println(r1);

        String name1 = "CYBERTEK";
            name1=    name1.toLowerCase();
        System.out.println(name1);

        String name2 = "i am from halach";
             name2=   name2.toUpperCase();

        System.out.println(name2);

        String A1 = "         Today is great day";
               A1= A1.trim();
        System.out.println(A1);

    }
}
