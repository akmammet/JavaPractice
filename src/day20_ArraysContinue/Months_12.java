package day20_ArraysContinue;

import java.util.Scanner;

public class Months_12 {
    public static void main(String[] args) {
        String[] months = {"January ","February ","March ","April ","May ","June ",
                "July ","August ","September ","October ", "November ","December "};
        //                      0       1           2           3       4       5
        // String[] month2 = new String[12];
        // month2[] ="January"
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();
        int attempts =0;

        while((num > 12) || num <= 0 ){
            System.out.println("Invalid Entry");
            System.out.println("Please re-enter the number");
            num = scan.nextInt();
            attempts++;

            if(attempts==3 && (num>12 || num <=0)){
                System.out.println("Invalid Entry, you already had 3 attempts stupid");
                System.exit(0);
            }
        }

        String result = months[num-1];
        System.out.println(result);

    }
}

