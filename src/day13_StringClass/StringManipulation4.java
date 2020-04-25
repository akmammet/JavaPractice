package day13_StringClass;

import java.util.Scanner;

public class StringManipulation4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter you car make and model");
        String makeAndModel = input.nextLine();

        String make = makeAndModel.substring(0, makeAndModel.indexOf(" "));
        String model = makeAndModel.substring(makeAndModel.indexOf(" ")+1);

        make = make.substring(0,1).toUpperCase()+makeAndModel.substring(1).toLowerCase();
        model =model.substring(0,1).toUpperCase()+makeAndModel.substring(1).toLowerCase();

        System.out.println("Your favorite car's MAKE: "+ make + " and model is: "+ model );

    }
}
