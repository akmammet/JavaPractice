package day07_ifStatements;
/*
4. write a java program that accepts three numbers and rteurn the mediam number
                (assume that none of them are equal)
 */
public class MediumNumber {
    public static void main(String[] args) {
        double a = 300;
        double b = 500;
        double c = 700;

        boolean aMedium = (a < b && a > c) || ( a>b &&a < c);
        boolean bMedium = (b < c && b > a) || ( b >c && b < a);
        boolean cMedium = (c > a && c < b) || ( c > b && c < a);

        if(aMedium){
            System.out.println(a+ " is the medium number");
        }
        if(bMedium){
            System.out.println(b+" is the minimum number");
        }
        if(cMedium){
            System.out.println(c+ " is the medium number");
        }


    }
}
