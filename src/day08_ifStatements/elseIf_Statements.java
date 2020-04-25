package day08_ifStatements;

public class elseIf_Statements {
    public static void main(String[] args) {
       int a = 100;
       /*  boolean zero = a==0;
        boolean negative = a<0;
        boolean positive = a>0;

        if (zero){
            System.out.println("zero");
        }
        if(negative){
            System.out.println("negative");
        }
        if(positive){
            System.out.println("positive");
        }
        */
        if(a==0){
            System.out.println("zero");
        } else if (a>0){
            System.out.println("Positive");
        }else{
            System.out.println("Negative");
        }

    }
}
