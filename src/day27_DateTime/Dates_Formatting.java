package day27_DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Dates_Formatting {
    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    LocalDate date1 = LocalDate.now();
        System.out.println(date1.format(dtf));

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("EEE MMMM/dd/yy");
        LocalDate date2 = LocalDate.of(2020,4,22);
        String str1 = date2.format(dtf2);
        System.out.println(str1);
}
}