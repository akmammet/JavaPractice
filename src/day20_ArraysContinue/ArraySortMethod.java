package day20_ArraysContinue;
import java.util.Arrays;
public class ArraySortMethod {
    public static void main(String[] args) {
        int[] arr1 = {9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println("First min number is: "+arr1[0]);
        System.out.println("Second min number is: "+ arr1[1]);

        System.out.println("First max number is: "+arr1[arr1.length-1]);
        System.out.println("First max number is: "+arr1[arr1.length-1-1]);

        char[] ch ={'Z', 'D','W', 'Y', 'A', 'B', 'D', 123};
        Arrays.sort(ch);

        System.out.println(ch);

        String [] names = { "Denny", "Sasha", "Geroy", "Harman"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
        System.out.println("============================");

        int[] arr = {3,1,4, -1, 100, -100, 200, 155};

        Arrays.sort(arr);

        int[] arrDec = new int[arr.length];

        System.out.println(Arrays.toString(arr));
        int j= 0;
        for(int i = arr.length-1; i>= 0;i--){

            //System.out.print(arr[i]+ " ");
            arrDec[j] = arr[i];

            j++;

        }
        System.out.println(Arrays.toString(arrDec));

    }
}
