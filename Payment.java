package lab3;
import java.util.Scanner;

public class Payment {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Loan p = new Loan();
        
        System.out.print("Enter the annual interest rate, for example, 8.25: ");
        double annInterestRate = input.nextDouble();

        System.out.print("Enter the number of years as an integer: ");
        int numOfYears = input.nextInt();

        System.out.print("Enter loan amount, for example, 120000.95: ");
        double loanAmt = input.nextDouble();

        p.setAnnualInterestRate(annInterestRate);
        p.setNumberOfYears(numOfYears);
        p.setLoanAmount(loanAmt);

        System.out.println("The loan was created on: " + p.getLoanDate());
        System.out.println("The monthly payment is: " + String.format("%.2f", p.getMonthlyPayment()));
        System.out.println("The total payment is: " + String.format("%.2f", p.getTotalPayment())); 

        input.close();

    }
}
