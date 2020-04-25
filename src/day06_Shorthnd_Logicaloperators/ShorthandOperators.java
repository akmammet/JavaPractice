package day06_Shorthnd_Logicaloperators;

public class ShorthandOperators {
    public static void main(String[] args) {
        int x = 20;
        x += 10; // x = x + 10
        System.out.println(x); //30

        x += 60;

        System.out.println(x); //90
        String schoolname ="Cybertek";
        schoolname += 12345789;
        System.out.println(schoolname);
        System.out.println('a'+ 'b');

        char ch1 = 'a';
            ch1 += 'b';
        System.out.println(ch1); // character
        int num = 'z';
            num += 'x';
        System.out.println(num);

        int a = 200;
            a -= 90;
        System.out.println(a);

        int b = 500;
            b -= a;
        System.out.println(b);

        int c = 9;
            c *= 8;
        System.out.println(c);

        int k = c *= 10;
        System.out.println(k);

        int a1 = 100;
        int b1 = (a1 *= 2) + ++a1;
        System.out.println(b1);

        int x1 = 10;
        int y = x1 += 10*2;
        System.out.println(y);

        int q = 20;
        int p = q*=20*3;
        System.out.println(p);

        int num1 =300;
        num1 /=2; // num1 = num1 / 2
        System.out.println(num1); //150

        int num2 = 400;
            num2 /= 20 + 10; // num2 =num2 / 20+10
        System.out.println(num2); //

        int num3 = 300;
        num3 %= 10+20;
        System.out.println(num3);














    }
}
