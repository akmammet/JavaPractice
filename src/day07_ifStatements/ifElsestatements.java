package day07_ifStatements;

public class ifElsestatements {
    public static void main(String[] args) {

     /*  int number = -8;
       if(number >= 0) {
           System.out.println(number+ " is positive");
       }
       if(number < 0){
           System.out.println(number + " is negative");
       }
       if (number >= 0){
           System.out.println(number + " is positive");
       } else {
           System.out.println(number+ " is negative");
       }
*/
     int number = -400;
     if(number %2 ==0){
         System.out.println(number+ " is even number");
     } else {
         System.out.println(number + " is odd number");
     }

     int age = 19;
     if( age >= 21){
         System.out.println("here is your vodka");
     } else {
         System.out.println("go get your milk");
     }

     boolean testedPositiveCorona = false;
     if(testedPositiveCorona){
         System.out.println("Go to doctor");
     } else {
         System.out.println("do more coding");
     }

    }
}
