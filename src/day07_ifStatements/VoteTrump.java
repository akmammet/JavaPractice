package day07_ifStatements;
/*
5. write a java program that can identify if a person
is eligible to vote for Donald Trump
 */
public class VoteTrump {
    public static void main(String[] args) {
        int age = 17;
        boolean UsCitizen = true;
        boolean likeDonald = true;

        boolean eligible = age >= 18 && UsCitizen == true;

        if( eligible) {
            System.out.println(" You are eligible to vote");
        }
        if(!eligible) {
            System.out.println(" Your are not eligible to vote");
        }
    }
}
