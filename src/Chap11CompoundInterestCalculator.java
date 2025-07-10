import java.util.Scanner;

public class Chap11CompoundInterestCalculator {
    public static void main(String[] args){
        // Compound Interest Calculator

        double principal, rate, amount;
        int timesCompounded, years;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble();

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow((1 + (0.01 * rate)/timesCompounded), timesCompounded * years);

        System.out.printf("\nThe amount after %d years is $%.2f", years, amount);

        scanner.close();
    }
}
