package day23_Methods;
/*
warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
public class Uniquevalues {
    public static void main(String[] args) {
        String[] arr2 = {"A", "A", "B", "C", "C"};

        for(String each3 : arr2){
            int count2 = 0;
            for(int i=0; i< arr2.length; i++){
                if(arr2[i].equals(each3)){
                    count2++;
                }
            }
            if(count2 == 1){
                System.out.println(each3);
            }
        }





        System.out.println("==========================================");
        String[] arr = {"A", "A", "B", "C", "C"};


        for (String each2 : arr) {

            int count = 0;
            for (String each : arr) {
                if (each.equals(each2)) {
                    count++;

                }
            }
                if (count == 1) {
                    System.out.println(each2);
                }
            }
        }
    }
