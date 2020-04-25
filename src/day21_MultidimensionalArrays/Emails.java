package day21_MultidimensionalArrays;

public class Emails {
    public static void main(String[] args) {
        String[] emails = {"Cybertek@gmail.com", "Cybertek@gmail.ru", "Cybertek@mail.com", "Cybertek@gmail.co"};

        for (String EachEmail : emails) {
            if (!EachEmail.endsWith("@gmail.com")) {
                continue;
            }
            System.out.println(EachEmail);
        }
    }
}