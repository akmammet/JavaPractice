package day06_Shorthnd_Logicaloperators;

public class warmUp {
    public static void main(String[] args) {
/*
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
Collapse



:+1:
9
:heart_eyes:
1
 */
        double numberOfGalons = 5;
        double galonsToLiters = numberOfGalons * 3.785;
        System.out.println(numberOfGalons + " gallons is equal to: " + galonsToLiters+ " liters");
        System.out.println("==============================================================");

        double numberOfLiters = 5;
        double literToGalons  = numberOfLiters / 3.785;
        String result2 = numberOfLiters + " liters is equal to "+ literToGalons + " Galons";
        System.out.println(result2);
        System.out.println("==============================================================");

        int a = 200; //199
        int b = -a++ + - --a * a-- % 2;
        //      -200 + - 200 * 200 % 2;
        //      -200 + -40000 % 2
        //      -200 + 0
        //      -200
        System.out.println(b);
        System.out.println(a);
        System.out.println("==============================================================");

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        System.out.println(z);

        boolean A =true, B =!A;
        if(A){
            if(B){
                System.out.println("Minday");
            }else{
                System.out.println("tuesday");
            }
        }else {
            if(A){
                System.out.println("thrsday");
            }else{
                System.out.println("friday");
            }
        }



}
}
