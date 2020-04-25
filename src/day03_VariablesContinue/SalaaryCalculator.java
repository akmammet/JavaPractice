package day03_VariablesContinue;

public class SalaaryCalculator {
    public static void main(String[] args) {
       double hourlyRate = 55;
       double stateTaxRate = 0.04;
       double federalTaxRate = 0.22;
       byte weeklyHours = 40;
       byte totalWeeks = 48;

    double salary = hourlyRate * weeklyHours * totalWeeks;
            // salary before tax
        // stateTax = salary * state tax rate
        // federalTax = salary * federal tax rate
    double stateTax = salary * stateTaxRate;
    double federalTax = salary * federalTaxRate;
        // salary after tax = salary - stateTax - federalTax;
    double salaryAfterTax = salary - stateTax - federalTax;
    double totalTax = stateTax+federalTax;

        System.out.println("Your salary is: $" + salary);
        System.out.println("State Tax is: $" + stateTax);
        System.out.println("Federal Tax is: $" + federalTax);
        System.out.println("Your Total Tax: $"+  ( stateTax + federalTax ));
        System.out.println("Salary After Tax is: $" + salaryAfterTax);


    }
}
