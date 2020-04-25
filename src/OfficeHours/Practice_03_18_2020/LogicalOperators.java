package OfficeHours.Practice_03_18_2020;

public class LogicalOperators {
    public static void main(String[] args) {
        // ||, &&, !

        boolean r1 = "Muhtar" == "Bad guy"; // false
        System.out.println(r1); //false

        boolean r2 = " Muhtar" != "Good guy"; // does not equal
        System.out.println(r2); // true

        boolean r3 = 10 >= 9; // true
        System.out.println(r3);
        boolean r4 = !false == !true;
                   //   true == false ==>false
        System.out.println(r4);

        // || as long as one condition is true return true
        // && as long

        boolean result1 = 9 != 8 && 9 == 9;
        System.out.println(result1);

       // boolean result2 = 'a' = 'A' || 'A' = "b";
        //                  false       || false ==> false

        boolean result3 = 6 > 5 && 6 < 4;
                //         true && false
        System.out.println(result3);
        //boolean result4 =

    }
}
