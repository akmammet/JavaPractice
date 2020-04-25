package day26_MethodOverloading;

public class Frequency {
    public static void main(String[] args) {
        String str = "ABB";
        char ch = 'A';

        char[] arr = str.toCharArray();
        int count = 0;
        for (char each : arr) {
            if (each == 'A') {
                count++;
            }
        }
        System.out.println(count);
        String str2 ="AJAAATAHAJAKJA";
        char ch2 = 'A';
        int num1 = frequency(str2, ch2);
        System.out.println(num1);
    }

    public static int frequency(String str, char ch) {
        char[] arr = str.toCharArray();
        int count = 0;
        for (char each : arr) {
            if (each == 'A') {
                count++;

            }
        }
        return count;
    }
}
