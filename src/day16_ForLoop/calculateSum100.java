package day16_ForLoop;
/*
3. write a program that can calculate the sum of all the even numbers
 between 1 ~ 100
	4. write a program that can calculate the sum of all the odd numbers
	between 1 ~ 100;

 */
public class calculateSum100 {
    public static void main(String[] args) {
        int sum1 = 0;
        int sum2 = 0;

        for(int num = 0; num <=100; num ++){
            if(num % 2==0){ //eben numbers
                sum1+= num;

            }else { // odd numbers
                sum2 += num;
            }
        }
        System.out.println("Sum of all even numbers: "+sum1);
        System.out.println("Sum of all odd numbers: "+sum2);
    }
}
