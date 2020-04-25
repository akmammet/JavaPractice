package day08_ifStatements;

/*
1.  write a program that can check the equality of the three given numbers
 			declare 3 numbers n1, n2, n3
  			if n1 and n2 are equal  => n1&n2 are equal
   			if n2 and n3 are equal ==> n2&n3 are equal
   			if n3 and n1 are equal ==>n3&n1 are equal
			if all equal ==> all equal
			if none of them are equal ==> none of them are equal

 */
public class equalNumbers {
    public static void main(String[] args) {
        double n1 = 200;
        double n2 = 700;
        double n3 = 500;

        boolean n1Equaln2 = n1 == n2 && n1 != n3;
        boolean n2Equaln3 = n2 == n3 && n2 != n1;
        boolean n3Equaln1 = n3 == n1 && n3 != n2;
        boolean allEqual = n1 == n2 && n1 == n3;
        boolean noneOfthemEqual = n1 != n2 && n2 != n3 && n1 != n3;
       // boolean noneOfthemEqual = n1Equaln2==false && n3Equaln1==false && n2Equaln3 ==false;
       // boolean noneofthemEqual = !n1Equaln2 && !n2Equaln3 && !n3Equaln1;

        if(n1Equaln2){
            System.out.println(n1+ " is equal to "+n3);
        }
        if(n2Equaln3){
            System.out.println(n2+ " is equal to "+n3);
        }
        if(n3Equaln1){
            System.out.println(n3+ " is equal to "+n1);
        }
        if(allEqual){
            System.out.println("all equal");
        }else{
            System.out.println("none of them are equal");
        }
    }
}
