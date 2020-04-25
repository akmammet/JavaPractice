package day15_Loop;

public class Reverse_String {

    public static void main(String[] args) {

        String str ="Universal";

        String reverse1 = ""+str.charAt(3) + str.charAt(2) + str.charAt(1) + str.charAt(0);
        int lastIndexNum = str.length()-1;

        String reverse2 = "";

        for (int i = lastIndexNum; i>=0; i--){

            reverse2+=str.charAt(i);
        }
        System.out.println(reverse2);

    }
}
/*
/*
        write a program to idenfiy if a string is palindrome or not. if yes==> true,.otherwise ==> false
                level ==> level ==> palindrome
         */
