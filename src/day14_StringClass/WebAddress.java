package day14_StringClass;
/*
 Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
 */
public class WebAddress {
    public static void main(String[] args) {

        String website = "WWW.limited77.Com";
             website = website.toLowerCase();

             boolean validEnding = website.endsWith(".com") || website.endsWith(".edu")|| website.endsWith(".gov");

        if(website.startsWith("www.") && validEnding){

            System.out.println("Valid:web address");
        } else {
            System.out.println("Invalid Address");
        }


    }
}
