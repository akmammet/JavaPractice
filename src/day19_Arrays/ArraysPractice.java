package day19_Arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        String[] friends = { "Aman" , "Dovran", "Gurban", "Jeren" , "Erkin" , "Peter", "Sapar"};
        //                      0       1           2           3       4           5       6
/*
        String s1= friends[4];
        System.out.println(s1);

 */ for(int i = 0; i<= 6; i++){

     String name = friends[i];
            System.out.println(name);
        }
    String[]emails = {"cybertek@yahoo.com", "cybertek@gmail.com", "cybertek@mail.com", "cybertek@bk.com"};

        for(int i = 0; i<=3; i++  ){
            String email = emails[i];
            if(email.endsWith("gmail.com")){
                System.out.println(email);
            }
        }
    }
}
