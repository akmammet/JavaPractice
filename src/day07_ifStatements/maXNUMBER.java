package day07_ifStatements;

public class maXNUMBER {
    public static void main(String[] args) {
        /*2.
        write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */
        double a = 500;
        double b = 200;
        double c = 300;

        boolean aGreater = a > b && a > c;
        boolean bGreater = b > a && b > c;
        boolean cGreater = c > a && c > b;

        if(aGreater){
            System.out.println("A is greatest number");
        }
        if(bGreater){
            System.out.println("B is greatest number");
        }
        if(cGreater){
            System.out.println("C is greatest number");
        }



    }
}
