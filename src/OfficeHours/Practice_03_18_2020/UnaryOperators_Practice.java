package OfficeHours.Practice_03_18_2020;

public class UnaryOperators_Practice {
    public static void main(String[] args) {

        //post increment
        int a = 20;
        System.out.println(a++);
        System.out.println(a);

        int b = 30;
        int c = b--;
        System.out.println(b);
        System.out.println(c);

        int d = 40;
        int e = d++;
        //pre increment; changes the value immediately
        int x = 600;
        System.out.println(--x);
        System.out.println(x);

        int z = 100; // 101, 100, 99, 100
        z = z++ + --z - z-- + ++z;
        //  100 + 100 - 100 + 100

        System.out.println(z);

        int u = 9000;//9001, 9003,
        int r = - ++u + ++u + -u++ ;
           //   -9001 + 9002 + -9002
        System.out.println(r);

    }
}
