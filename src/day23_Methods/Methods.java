package day23_Methods;

public class Methods {
    public static void main(String[] args) {
        printHelloWorld5Times();
    }

    public static void printHelloWorld5Times() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World");
        }
    }
    public static void evenNumbers1_100(){
        for(int j =0; j<101;j++){
            if(j % 2 ==0){
                System.out.println(j+" ");
            }
        }
        System.out.println();
    }




}