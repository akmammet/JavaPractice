package day04_javaRecap;

public class arithmetic_oprators {

    public static void main(String[] args) {

        int a = 10 / 3;
        System.out.println( 10 % 4);
        System.out.println(25 % 2);
        boolean evenNumber = 25 % 2 == 0;
        System.out.println(evenNumber);

        boolean oddNumber = 22 % 2 == 0;
        System.out.println(oddNumber);

        System.out.println( "25 is odd number:" + (25%2 != 0));

        System.out.println("25 is even number: "+ !(15 % 2 != 0));



    }
}
