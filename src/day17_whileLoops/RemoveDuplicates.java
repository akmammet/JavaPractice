package day17_whileLoops;

public class RemoveDuplicates {
    public static void main(String[] args) {


        String str ="Java is fun,Java is cool";

        int count = 0;
        while(str.contains("Java")){
            count++;
        str=str.replaceFirst("Java","");
        }

        System.out.println(count);
    }
}
