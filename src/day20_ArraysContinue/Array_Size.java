package day20_ArraysContinue;

public class Array_Size {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3} ;
       // System.out.println(arr[100]);

        int[]nums = new int[2]; // {0, 0};
        nums[0] = 10;
        nums[1] = 20;

        System.out.println(nums[0]);
        System.out.println(nums[1]);

        nums = new int[3]; // Reset, {0, 0, 0};
        System.out.println(nums[0]);
        System.out.println(nums[1]);

    }
}
