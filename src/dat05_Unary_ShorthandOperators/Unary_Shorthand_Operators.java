package dat05_Unary_ShorthandOperators;

public class Unary_Shorthand_Operators {
    public static void main(String[] args) {
        int a =100;
        System.out.println( ++ a); //a =101

        int b = 100;
        System.out.println(--b); // b = 99;

        // Post: first passes the current value, eventually chages the variable value
        int A =200;
        System.out.println(A ++);
        int B = 1500;
        System.out.println(B--);
        System.out.println(B);



    }
}
