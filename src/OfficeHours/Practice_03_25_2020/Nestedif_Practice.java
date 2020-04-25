package OfficeHours.Practice_03_25_2020;

public class Nestedif_Practice {
    public static void main(String[] args) {

        int salary = 45000;
        short creditScore = 750;
        byte jobHistory = 1;

        if ( salary > 50000){

            if (creditScore > 650){

                if (jobHistory >= 2){
                    System.out.println("You are qualified");
                } else{
                    System.out.println("You don't have enough job history, come back later");
                }

            }else{
                System.out.println("You need to improve your score");
            }

        }else{
            System.out.println("Get outta here, you poor bitch");
        }



    }
}
