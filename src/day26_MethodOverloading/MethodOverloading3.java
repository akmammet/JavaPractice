package day26_MethodOverloading;

public class MethodOverloading3 {
    public static void main(String[] args) {
        sum(10,20);
        sum(1.5, 4.5);
    }



    public static void sum(int a, int b){
        System.out.println(a+b);
    }
    public static double sum( double a, double b){
        return a+b;
    }

}
