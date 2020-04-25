package day09_NestedIf_Ternary;

public class ternary_Practice2 {
    public static void main(String[] args) {
        /*int age = 35;
        String ageGroup = "";

        if(age < 3 && age > 0){
            ageGroup = "Baby";
        } else if(age >= 3 && age <= 5){
            ageGroup = "Toddler";
        } else if(age >= 6 && age <= 9){
            ageGroup = "Kid";
        } else if(age >= 10 && age <= 12){
            ageGroup = "Pre-Teen";
        } else if(age >= 13 && age <=17){
            ageGroup = "Teenager";
        } else if(age >=18 && age <= 20){
            ageGroup = "Young adult";
        } else if(age >= 21 && age <=39){
            ageGroup = "Adult";
        } else if(age >=40 && age <= 49){
            ageGroup = "Young Middle Aged adult";
        } else if(age >= 50 && age <= 54){
            ageGroup = "Middle Aged Adult ";
        } else if(age >= 55 && age <= 64){
            ageGroup = "Very Young Seniors";
        } else if(age >= 65 && age <= 74){
            ageGroup =" Young Seniors";
        } else if( age >= 75 && age <= 84){
            ageGroup =" Senior Citizens";
        } else if(age >=85 && age <=150){
            ageGroup = " Old Senior Citizens";
        } else {
            ageGroup = "Invalid Entry";
        }*/
        int num1 = 300;
        int num2 = 299;
        int min = (num1 < num2) ? num1 : num2;
        System.out.println(min);

        int hour =10;
        String result = (hour<12)? "Good Morning" : (hour >12 && hour<18)? "Good Afternoon" : "Good Evening";
        System.out.println(result);

        System.out.println("=============================================================");

        int number = 12000;
        boolean divisibleBy3And5 = ( number %3 ==0 && number % 5 ==0) ? true : false;
        System.out.println(divisibleBy3And5);



    }
}
