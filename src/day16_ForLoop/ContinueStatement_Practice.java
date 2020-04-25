package day16_ForLoop;

public class ContinueStatement_Practice {
    public static void main(String[] args) {
        for(char ch= 'z'; ch>'a'; ch--){
            if(ch=='y' || ch == 'h' || ch=='j' || ch =='d'){
                continue;
            }
            System.out.print(ch+" ");
        }
        System.out.println();
        for(int i =1; i<= 100; i++){
            if(i%3==0 || i%3 ==0){
                continue;
            }


            System.out.print(i+" ");
        }


    }
}
