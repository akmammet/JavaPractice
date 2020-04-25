package day18_NestedLoop;

public class do_while_practice {
    public static void main(String[] args) {
        int number = 0;
        do{
            if(number %2 !=0){
                System.out.print(number+" ");


            }


            number++;
        } while(number <=100);

        System.out.println();
        System.out.println("=================================================");

        int i = 1;
        do{

            System.out.println(i);
            i++;

        }while(i<=5);

        System.out.println("=================================================");
        int z =1;
        do{
            System.out.println(z);
            if(z==3){
                break;
            }

            z++;
        } while(z<=5);
        System.out.println("=================================================");

        System.out.println("=================================================");

        int t =1;
        do{
            t++;

            if(t %2 !=0){
                continue;
            }
            System.out.println(t);
            t++;
        } while (t <= 100);







    }
}
