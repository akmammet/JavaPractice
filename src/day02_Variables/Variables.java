package day02_Variables;

public class Variables {

    public static void main(String[] args) {
        /*
        declare variables:
            DataType variableName = Data

         */
        byte l = 4;
        byte w = 2;
        byte area = 8;
        System.out.println(l);
        System.out.println(w);
        System.out.println(area);

        //byte num = 2.5; byte, short, int, long they only accept whole numbers
        // byte num1 = 130; exceeds the range of byte

        System.out.println(12345);
        int n1 = 20000;
        int n2 = 2000000;
        long n3 = 99999999999999999L;

        // double >float> long > int > short > byte
        System.out.println(n3);
    }
}
