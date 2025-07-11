import java.util.Scanner;

public class Chap16TernaryOperator {
    public static void main(String[] args){
        // ternary operator ? = Return 1 of 2 values if a condition is true
        // variable = (condition) ? ifTrue : ifFalse;

        int score, number;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur score: ");
        score = scanner.nextInt();

        System.out.print("Enter a number: ");
        number = scanner.nextInt();

        String passOrFail = (score >= 55) ? "PASS" : "FAILED";
        String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";

        System.out.println(passOrFail);
        System.out.println(evenOrOdd);
    }
}
