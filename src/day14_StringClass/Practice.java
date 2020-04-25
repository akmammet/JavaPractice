package day14_StringClass;

public class Practice {
    public static void main(String[] args) {
        String gmail = "pesti89@gmail.com";

        String userinputGmail = "Pesti89@gmail.com";

        boolean result = gmail.equalsIgnoreCase(userinputGmail);

        if(result){
            System.out.println("Logged in");
        } else{
            System.out.println("invalid entry");
        }

        String s1 ="Cybertek School";
        boolean r1 =  s1.contains("School"); // true

        System.out.println(r1);

        System.out.println("====================================================");

        String passWord = "mmadd3455";

        if(passWord.contains(" ")){
            System.out.println("Password cannot have space in it");
        } else {
            System.out.println("Valid Password");
        }

        String s3 = "United States";
        System.out.println(s3.startsWith("U"));

        System.out.println("====================================================");

        String webAddress = "www.limited77.com";
        if(webAddress.startsWith("www.")){
            System.out.println("Valid web address");
        } else{
            System.out.println("Invalid web address");
        }

        System.out.println("====================================================");

        String s4 = "Cybertel School";
        System.out.println(s4.endsWith("l"));

        String gMail = "pesti89@gmail.com";
        System.out.println(gMail.endsWith("gmail.com"));



        if (gMail.endsWith("gmail.com")){
            System.out.println("Valid gmail");
        }else{
            System.out.println("Invalid gmail");
        }

        System.out.println();



    }
}
