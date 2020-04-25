package OfficeHours.Practice_03_18_2020;

import org.w3c.dom.ls.LSOutput;

public class ShorthandOperators {
    public static void main(String[] args) {
        // += addition assignment
        int a = 100;
        //a = a + 200;
        a+=200;
        System.out.println(a); // a= 300

        a+=200 * 3; // sag tarap ilki goshulya, son cepe gosulya
        // a = a-400;
        a-=400;
        System.out.println(a);

        // *= multiplication assignment
        int b = 300;
        b -= 3 * 40;
        System.out.println(b);

        int x = 5;
        // x = x * 3;
        x *=3; // 15
        System.out.println(x);


        //  /= division assignment
        int n1 = 2500;
        n1 /= 5;//n1 = n1 / 50;
        System.out.println(n1);
        n1/= 3*5+15-5;
        System.out.println(n1);

        // %= remainder assignment

        int m =100;
      //  m = m %3; // 1
        m%=3;
        System.out.println(m);
        int y = 3000;
        y %= 3*5;
        System.out.println(y);

        int t = 500;
        t %= 16*3;
        System.out.println(t);










    }
}
