import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Mortgage Calculator
        System.out.println("Mortgage Calculator\n");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Annual Interest Rate: ");
        double annualInterestRate = scanner.nextDouble();
        System.out.print("Period(years): ");
        int period = scanner.nextInt();

        double monthlyInterestRate = (annualInterestRate / (double)100) / (double)12;
        //(1+monthlyInterestRate)
        double incrementMonthlyInterestRate = monthlyInterestRate + (double)1;
        int n = period * 12;
        double calculationNumerator = (double)principal * monthlyInterestRate * Math.pow(incrementMonthlyInterestRate, (double)n);
        double calculationDenominator = (Math.pow(incrementMonthlyInterestRate, (double)n)) - (double)1;
        double result = calculationNumerator / calculationDenominator;
        NumberFormat mortgage = NumberFormat.getCurrencyInstance();

        System.out.println("Mortgage: " + mortgage.format(result));
        

    }
}

