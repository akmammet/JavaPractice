package day22_Arrays_Loops;

public class NestedLoops {
    public static void main(String[] args) {
        char[][] arr2D = {{'A', 'B'}, {'C', 'D', 'E'}, {'F', 'J', 'H', 'I'}};

        for (int i = 0; i < arr2D[0].length; i++) {
            System.out.println(arr2D[0][i]);
        }
        for (int i = 0; i < arr2D[1].length; i++) {
            System.out.println(arr2D[1][i]);
        }
        for (int i = 0; i < arr2D[2].length; i++) {
            System.out.println(arr2D[2][i]);
        }
    }

    public static class Nested_Loops_2 {
        public static void main(String[] args) {
           int[][] numbers = {{1, 2}, {10, 15, 40}, {12, -1, 9, 42, 55}};
        }
    }
}