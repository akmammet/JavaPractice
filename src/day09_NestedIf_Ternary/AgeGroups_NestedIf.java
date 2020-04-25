package day09_NestedIf_Ternary;
/*
write a program that can define the age groups of a person
             age groups are:
                    Teenager (<21),
                    Adult (>=21 && <55),
                    Senior Citizen (>55),
 */
public class AgeGroups_NestedIf {
    public static void main(String[] args) {
        int agePerson = 87;
        String ageGroup ="";

        if(agePerson>0 && agePerson <150){
            ageGroup=(agePerson<21)? "Teenager": (agePerson>=21 && agePerson<55)? "Adult" : "Senior Citizen";


        }else{
            System.out.println("Invalid entry");
        }
        System.out.println(ageGroup);
    }
}
