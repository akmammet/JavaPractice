package day16_ForLoop;

public class DivisibleBy_3and5 {
    public static void main(String[] args) {

        for (int num = 1; num <= 100; num++) {

            if (num % 2 == 0) {
                if (num % 3 == 0 && num % 5 == 0) {
                    System.out.println(num);
                }
            }

        }
    }
}