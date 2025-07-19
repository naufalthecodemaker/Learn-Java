import java.util.InputMismatchException;
import java.util.Scanner;

public class Chap57ExceptionHandling {
    public static void main(String[] args){
        // exception = an event that interrupts the normal flow of a program
        //             Example: dividing by zero, file not found, mismatch input type
        //             Surround any dangerous code with a try{} block
        //             try{}, catch{}, finally{}

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            System.out.println(num);
        } catch (ArithmeticException e) {
            System.out.println("YOU CAN'T DIVIDE BY ZERO!");
        } catch (InputMismatchException e) {
            System.out.println("THAT WASN'T A NUMBER");
        } catch (Exception e) {
            // SAFETY NET
            System.out.println("Something went wrong!");
        } finally {
            System.out.println("This always executed ");
        }
    }
}
