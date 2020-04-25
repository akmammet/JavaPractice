package day24_Methods;

import java.util.Arrays;

public class ReturnMethod_Practice {

    public static int maxNumber(int[] arr){
        Arrays.sort(arr);
        return arr [arr.length-1];
    }


}
