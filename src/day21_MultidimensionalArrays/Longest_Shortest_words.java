package day21_MultidimensionalArrays;

public class Longest_Shortest_words {
    public static void main(String[] args) {
        String[] names = {"Reem", "Mehmet", "Kerimmuhammet", "Ali", "Muhtar", "Aylarmuhammetnyyaz" };

        int maxLengthString = names[0].length();
        int minLengthString = names[0].length();
        String longestWord = "";
        String shortestWord ="";

        for(int i = 1; i <= names.length-1; i++){

            if(names[i].length() > maxLengthString){
                maxLengthString = names[i].length();
                longestWord = names[i];
            }

            if(names[i].length() < minLengthString){

                minLengthString = names[i].length();
                shortestWord = names[i];

            }


        }
        System.out.println(longestWord);
        System.out.println(shortestWord);
    }
}
