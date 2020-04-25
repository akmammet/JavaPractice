package day16_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for(int i =1; i <= 5; i++){

            if(i==3){
                break;
            }
            System.out.println("Hello World");

            for(char i1 = 'a'; i1<='z'; i1++){

                if(i1=='e'){
                    break;
                }
                System.out.println(i1);
            }

            //break;
        }
    }
}
