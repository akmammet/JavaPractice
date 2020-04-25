package day15_Loop;

public class ForLoop_Practice {
    public static void main(String[] args) {

        String resultOdd = "";

        for(int number=1; number<101; number +=2 ){

          //  System.out.print(number+ " ");
          //  resultOdd += number+" ";
            resultOdd = resultOdd + number+" ";
        }
        System.out.println(resultOdd);


        String evenNumbers ="";
        for(int number2 = 2; number2<= 1000; number2+=2 ){
            evenNumbers += number2 + " ";
        }
        System.out.println(evenNumbers);



    }
}
