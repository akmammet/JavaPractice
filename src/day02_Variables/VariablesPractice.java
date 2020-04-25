package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {
        /*
        salary, federaltax, statetax, loan, snn
         */

        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;
        //salary after tax = saalry91-sum of taxes)
     double sumTaxes = federalTax + stateTax;
     double salaryAfterTax = salary * (1-sumTaxes);

        System.out.println(salaryAfterTax);
        System.out.println("============================================================");

        //area of the circle - r * r *pi

        double r = 5.5;
        double area = r * r * 3.14;
        System.out.println(area);

      double kg = 90;
      double pound = kg * 2.25;
        System.out.println(pound);

      double lira = 10000;
      double liraInDollar = lira / 6.15;
        System.out.println(liraInDollar);

        double liter = 250;
        double literinGallons = liter / 3.7;
        System.out.println(literinGallons);



    }
}
