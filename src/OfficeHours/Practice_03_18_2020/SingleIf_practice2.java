package OfficeHours.Practice_03_18_2020;

public class SingleIf_practice2 {
    public static void main(String[] args) {
        byte age = 19;
        boolean eligibleToBuy = age > 21 || age == 21;
        if (eligibleToBuy){
            System.out.println("You are eligible to buy alcohol" + " here is your vodka");
        }
        if(!eligibleToBuy){
            System.out.println("Go drink your milk");
        }

        boolean feeling = true;
        if (feeling==false){
            System.out.println("Dont be sad");
        }
        if(feeling==true){
            System.out.println("Stay Happy");
        }

    }
}
