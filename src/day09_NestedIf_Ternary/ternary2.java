package day09_NestedIf_Ternary;

public class ternary2 {
    public static void main(String[] args) {

        // ternary: ? means if, : else
        String result = "";
        if(9 > 10){
            result= "9 is Greater";
        } else{
            result = "10 is Greater";
        }
        String result2=(9 > 10) ? "9 is Greater" : "10 is Greater";
        System.out.println(result);
        System.out.println(result2);


        int age = 50;
        boolean eligibility= (age >=21) ? true : false;
       /*if (age>=21){
            eligibility = true;
        } else {
            eligibility =false;
        }
        */
        System.out.println(eligibility);
        System.out.println("=================================================");

        int ageOfPerson = 28;
        String eligibleToVote = "";
        if(ageOfPerson >=18){
            eligibleToVote = "Yes";
        } else {
            eligibleToVote = "NO";
        }
        String eligibleToVote2 = (ageOfPerson >=18) ? "Yes" : "NO";
        System.out.println(eligibleToVote);
        System.out.println(eligibleToVote2);






    }
}
