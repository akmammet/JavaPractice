package day06_Shorthnd_Logicaloperators;

public class SingleIfStatements {
    public static void main(String[] args) {

      boolean coldWeather = true;
        if(coldWeather){
            System.out.println("Wear your hat");
            System.out.println("Wear your jacket");
        }

      boolean coronaDetected = true;
        if(coronaDetected){
            System.out.println("Buy more toilet papers");
            System.out.println("Buy more water");
            System.out.println("Stay at home");
            System.out.println("Do more Java coding");

        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        int a = 200;
        boolean evenNumber = (a % 2)==0;
        boolean oddNumber = a % 2 !=0;// if the number cant be didivded by 2 evenly
        if (evenNumber){
            System.out.println(a + " is even number");
            boolean R2 = 20>15 && 15 <18;
            System.out.println(R2);
        }
        if (oddNumber){
            System.out.println(a + " is odd number");
        }

        System.out.println("    Java is a programming language");

        System.out.println("\tJava is a programming language");
        // \t is used for giving paragraph space

        System.out.println("\nWe Love learning Java");
        // \n is used for starting a new line
        System.out.println("\n\tWe Love learning Java");

        System.out.println("I love the TV show \"The Walking Dead\"");
        System.out.println("My favorite quote is \"Night is dark, Full of terrors\" ");
        // \" used for printing double quote


        System.out.println("/ \\");
        //  \\ is used for printing single back slash

    }
}
