package OfficeHours.Practice_04_15_2020;

public class NestedLoops {
    public static void main(String[] args) {
        char [][] arr2D= {{'A', 'B', 'C'},{'D','E','K'},{'L', 'M','N','O','P'}};

        for(int j=0; j<arr2D.length; j++){

            for(int i = 0; i<= arr2D[j].length-1;){
                System.out.println(arr2D[j][i]);
                i++;
            }

        }
        System.out.println("===============================================");
        for (char [] each1DArray: arr2D) {

            for(char eachElement : each1DArray){
                System.out.println(eachElement);
            }



        }
    }
}
