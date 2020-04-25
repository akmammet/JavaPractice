package day08_ifStatements;

public class EqualNumber_MultibranchIf {
    public static void main(String[] args) {

        double n1 = 200;
        double n2 = 700;
        double n3 = 500;

        boolean n1Equaln2 = n1 == n2 && n1 != n3;
        boolean n2Equaln3 = n2 == n3 && n2 != n1;
        boolean n3Equaln1 = n3 == n1 && n3 != n2;
        boolean allEqual = n1 == n2 && n1 == n3;

        if(n1Equaln2){
            System.out.println("n1 is equal to n2");
        } else if (n2Equaln3){
            System.out.println("n2 is equal to n3");
        } else if (n3Equaln1){
            System.out.println("n3 is equal to n1");
        } else if (allEqual){
            System.out.println("all equal");
        } else {
            System.out.println("none of them are equal");
        }

    }
}
