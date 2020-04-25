package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {
        int a =100;
        int[] arr ={100,200,300};
        System.out.println(arr[1]);

        for(int i = 0; i <=2; i++){
            int num =arr[i];
            System.out.println(num);
        }
        System.out.println("====================================");
        int j =0;
        while( j < 3){
            int num = arr[j];
            System.out.println(num);
            j++;
        }
        System.out.println("====================================");
        String[] names = {"John", "Aaron", "Luoise", "Muhtar"}; //3
        int length = names.length;
        String[] namesRev = new String[length];
            namesRev[0] = names[2];
            namesRev[1] = names[1];
            namesRev[2] = names[0];

        System.out.println(Arrays.toString(namesRev));
        System.out.println("====================================");


        int k = length-1;
        for(int i = 0; i<length; i++){
           namesRev[i]=names[k];
           k--;
        }
        System.out.println(Arrays.toString(namesRev));
        System.out.println("====================================");
        int m = 0;
        int n = length-1;
        while(m<length){
            namesRev[n]=names[m];
            m++;
            n--;
        }
        System.out.println(Arrays.toString(namesRev));
    }
}
