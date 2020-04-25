package day13_StringClass;

public class StringManipulations2 {
    public static void main(String[] args) {

        String str = "I am Akmammet, will be the champion";
        //
        String myName = str.substring(5,13);
        System.out.println(myName);

        String fullName = "Akmammet Allakgayev";

        String firstName = fullName.substring(0,8);
        String lastName = fullName.substring(9,19);

        System.out.println(firstName+ " "+ lastName);


        String s2 =" I like c# Programming";
        s2= s2.replace("C#", "Java");
        System.out.println(s2);

        String name ="COVID 18";
       name= name.replace("8","9");
        System.out.println(name);



    }
}
