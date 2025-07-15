import java.util.Random;
import java.util.Scanner;

public class Chap30DiceRollerProgram {
    public static void main(String[] args){
        // JAVA DICE ROLLER PROGRAM
        int numOfDice, total = 0;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter the number of dice to roll: ");
        numOfDice = scanner.nextInt();

        System.out.println();

        if(numOfDice > 0){
            for(int i = 0; i < numOfDice; i++){
                int roll = random.nextInt(1, 7);
                System.out.println("You rolled: " + roll);
                printDie(roll);
                total += roll;
            }
            System.out.println("\nTotal: " + total);
        } else{
            System.out.println("Number of dice must be greater than 0");
        }

        scanner.close();
    }

    static void printDie(int roll){
        String dice1 = """
                 -----------
                |           |
                |     ●     |
                |           |
                 -----------
                """;

        String dice2 = """
                 -----------
                |  ●        |
                |           |
                |        ●  |
                 -----------
                """;

        String dice3 = """
                 -----------
                |  ●        |
                |     ●     |
                |        ●  |
                 -----------
                """;

        String dice4 = """
                 -----------
                |  ●     ●  |
                |           |
                |  ●     ●  |
                 -----------
                """;

        String dice5 = """
                 -----------
                |  ●     ●  |
                |     ●     |
                |  ●     ●  |
                 -----------
                """;

        String dice6 = """
                 -----------
                |  ●  ●  ●  |
                |           |
                |  ●  ●  ●  |
                 -----------
                """;

        switch (roll){
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid roll!");
        }

    }
}
