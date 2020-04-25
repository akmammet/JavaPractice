package OfficeHours.Practice_03_25_2020;

public class IfStatement_review {
    public static void main(String[] args) {

        String browserName = "Chrome";

        if (browserName == "Firefox"){
            System.out.println("Firefox browser is opening");
        } else if(browserName == "Chrome"){
            System.out.println("Chrome browser is opening");
        } else if (browserName == "Internet Explorer"){
            System.out.println("Internet Explorer browser is opening");
        } else if (browserName == "Safari"){
            System.out.println("Safari browser is opening");
        } else if (browserName == "Opera"){
            System.out.println("Opera browser is opening");
        } else {
            System.out.println("Invalid Browser Name");
        }

    }
}
