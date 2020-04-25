package day09_NestedIf_Ternary;

public class ternary_practice {
    public static void main(String[] args) {
        int num = 100;
        String result = "";

        if(num % 2 == 0){
           result= "Even Number";
        } else {
            result = "Odd Number";
        }

        String result2 = (num % 2 == 0) ? "Even Number" : "Odd Number";
        System.out.println(result);
        System.out.println(result2);

        System.out.println("==========================================================");
        int num1 = 100;
        int num2 = 200;
        int max = 0;

        if ( num1 > num2){
            max =num1;
        } else {
            max = num2;
        }

        int max2 = (num1 > num2) ? num1 : num2;

        System.out.println(max);
        System.out.println(max2);

        System.out.println("==========================================================");

        String str ="";
        if(true){
            str = "Hello";
        } else{
            str = "Hola";
        }


        String str2 = (true) ? "Hello" : "Hola";
        System.out.println(true);



    }
}
