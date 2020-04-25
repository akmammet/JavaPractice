package day14_StringClass;

public class StringManipulation2 {
    public static void main(String[] args) {
        String str = " ";

        boolean b1 =   str.isEmpty(); // true
        System.out.println(b1);

        String s1 ="Cat"; //String literal
        String s2 = new String("Cat");

        System.out.println(s1==s2);

        System.out.println(s1.equals(s2));

        String z1 ="Radio";
        String z2 = new String("Radio");
        String z3 = "Radio";
        String z4 = "Cassette";

        System.out.println( z1.equals(z2));
        System.out.println( z2.equals(z3));
        System.out.println( z1.equals(z3));
        System.out.println( z1.equals(z4));




    }
}
