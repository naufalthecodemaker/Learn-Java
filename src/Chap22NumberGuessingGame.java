import java.util.Scanner;
import java.util.Random;

public class Chap22NumberGuessingGame {
    public static void main(String[] args){
        Random random = new Random();

        int guess, attempts = 1;
        int randomNumber = random.nextInt(1, 101);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Number Guessing Game");
        System.out.println("Guess a number between 1-100");

        do{
            System.out.print("Enter a guess: ");
            guess = scanner.nextInt();

            if(guess > randomNumber){
                System.out.println("TOO HIGH! Try again");
                attempts ++;
            } else if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
                attempts ++;
            }
        } while(guess != randomNumber);

        System.out.printf("\nYayyy, you GUESSED the number in %d attempts! It's %d", attempts, randomNumber);

        scanner.close();
    }
}
