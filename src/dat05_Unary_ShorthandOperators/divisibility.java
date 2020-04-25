package dat05_Unary_ShorthandOperators;

public class divisibility {
    public static void main(String[] args) {
        /*
         2. write a program that can check if a number is evenly divisible by 2, 3, 5,
            Ex:
                number = 65; ==>int
            output:
                65 is divisible by 2: true/false
                65 is divisible by 3: true/false
                65 is divisible by 5: true/false
                number = 80;
            output:
                80 is divisible by 2: true
                80 is divisible by 3: false
                80 is divisible by 5: true
         */
        // DataType VariableName = Data;
        int number =65;
        boolean divisibleBy2 = number % 2 == 0; //if the number can be divided by 2 without reminder that means even;
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;



        String result1 = number + " is divisible by 2: " +divisibleBy2;
        System.out.println(divisibleBy3);
        System.out.println(divisibleBy5);

    }

}
