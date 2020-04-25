package dat05_Unary_ShorthandOperators;

public class VariablesPractice {
    public static void main(String[] args) {

        // whole numbers: byte, short, int, long
        // decimals: float, double

        int a1 =100;
        float f1 =(long)a1;
        System.out.println(f1);

        long l1 = (long)f1;
        // l1 = 100

    String name = "Akmammet";

        System.out.println(name);




    }

    public static class PostPreExamples {

        public static void main(String[] args) {
            int z = 10;
            int x = ++z;
            System.out.println(x);

            int s = 10;
            int f = s++;
            System.out.println(f);
            System.out.println(s);

            double t1 = 3.5;
            double t2 = t1--;
            System.out.println(t2);
            System.out.println(t1);

            int num = 35;
            System.out.println(num++);
            System.out.println(num--);

            int a = 50;
            a = --a + a++ + a-- + a++;
            System.out.println(a);
            System.out.println(a);

            int x1 = 4;
            int y1 = x * 4 - x++;
            System.out.println(y1);

            int a3 = 1; // 0
            a3 = -a3-- + a3++ / -a3-- * --a3;
            // = -1   + 1
            System.out.println(a3);




        }
    }
}
