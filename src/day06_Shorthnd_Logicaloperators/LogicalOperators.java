package day06_Shorthnd_Logicaloperators;

public class LogicalOperators {
    public static void main(String[] args) {
        boolean result = true;
        System.out.println(!result); // false

        boolean result2 = 10 + 15 > 15;
        System.out.println(!result2);

        boolean result3 = !true == !false;
        System.out.println(result3);

        boolean R2 = 20>15 && 15 <18;
        System.out.println(R2);

        boolean R3 = 'a' == 'b'-1 && 'b' + 1 == 'c';
        System.out.println(R3);

        boolean R6 = !!!false;
        System.out.println(R6);
    }

}
