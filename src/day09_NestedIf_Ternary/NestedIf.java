package day09_NestedIf_Ternary;

public class NestedIf {
    public static void main(String[] args) {
        int age = 19;
        boolean USCitizen = false;
        if(USCitizen){

            if(age>17){
                System.out.println("You are eleigible to vote");
            }else{
                System.out.println("grow up first, and then vote");
            }
        }else{
            System.out.println("only US Citizens are eligible to vote Donald Trump");
        }

        System.out.println("+=++++++++++++++++++++++++++++++++++++++++++++");

        int score = 18;
        String grade ="";
        if(score>=0 && score<=100){

            if(score >= 90){
                grade = "A";
            } else if(score >= 80){
                grade = "B";
            } else if(score >= 70){
                grade = "C";
            } else if(score >= 60){
                grade = "D";
            } else {
                grade = "F";
            }




        }else{
            grade = "Invalid Entry";
        }
        System.out.println(grade);

        int score2 = 115;
        String grade2 = "";
        if(score2>=0 && score2<=100){
            grade2 = (score2>=90)? "A" : (score2>=80)? "B" : (score2 >=70)? "C" : (score2 >=60)? "D":
                    "F";


        }else{
            grade2 =" Invalid entry fcuck";
        }
        System.out.println(grade2);








    }
}
