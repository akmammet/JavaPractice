package day18_NestedLoop;

import java.util.Scanner;

/*
2. write a program that can retunr the factorial number of any given number
			Ex:
				input: 5
				output: 120
			because:
				5! = 5 * 4 * 3 * 2* 1 = 120
 */
public class FactorialNumber {
    public static void main(String[] args) {

   /*     Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number");
        long num = scan.nextInt();
        long result = 1;
        while(num >= 1){

            result*=(num);

            num--;
        }
        System.out.println(result);
*/      int z=5;

        for(int i=5; i>0;i--){

            z+=i;

        }
        System.out.println(z);
    }
}
