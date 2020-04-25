package day17_whileLoops;

public class PlaindromeTest {
    public static void main(String[] args) {

        String str = "ey edip adanada pide ye";

        String reverseStr = "";

        int index= str.length()-1; //last index number

        while(index>= 0){

        reverseStr += str.charAt(index);

            index--;
        }
        boolean palindrome = reverseStr.equalsIgnoreCase(str);

        System.out.println(palindrome);


    }
}
