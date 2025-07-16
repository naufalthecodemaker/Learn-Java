import java.util.Scanner;
import java.util.Random;

public class Chap38SlotMachine {
    public static void main(String[] args){
        String symbol1, symbol2, symbol3, confirm;
        int balance = 100, bet;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        do{
            System.out.println("***************************");
            System.out.println("   Welcome to Java Slots");
            System.out.println("  Symbols:🍒 🍉 🍋 🔔 ⭐");
            System.out.println("***************************");
            System.out.printf("Current Balance       : $%d\n", balance);
            System.out.print("Place your bet amount : $");
            bet = scanner.nextInt();

            while(bet <= 0){
                System.out.println("Your bet can't be $0 or less!");
                System.out.print("Place your bet amount : $");
                bet = scanner.nextInt();
            }

            while(bet > balance){
                System.out.println("Your balance is insufficient to place this bet!☹️☹️☹️");
                System.out.print("Place your bet amount : ");
                bet = scanner.nextInt();
            }

            balance -= bet;
            System.out.println("Spinning...");
            System.out.println("***************");

            int randomNum1 = random.nextInt(1, 6);
            int randomNum2 = random.nextInt(1, 6);
            int randomNum3 = random.nextInt(1, 6);

            symbol1 = switch (randomNum1){
                case 1 -> " 🍒";
                case 2 -> " 🍉";
                case 3 -> " 🍋";
                case 4 -> " 🔔";
                case 5 -> " ⭐";
                default -> "";
            };
            symbol2 = switch (randomNum2){
                case 1 -> " 🍒";
                case 2 -> " 🍉";
                case 3 -> " 🍋";
                case 4 -> " 🔔";
                case 5 -> " ⭐";
                default -> "";
            };
            symbol3 = switch (randomNum3){
                case 1 -> " 🍒";
                case 2 -> " 🍉";
                case 3 -> " 🍋";
                case 4 -> " 🔔";
                case 5 -> " ⭐";
                default -> "";
            };

            System.out.print(symbol1 + " |" + symbol2 + " |" + symbol3);
            System.out.println("\n***************");

            if(randomNum1 == randomNum2 && randomNum1 == randomNum3){
                System.out.println("JACKPOT!!! YOUR BALANCE WILL be MULTIPLIED by 50 🤑💰🤑💰🤑");
                balance += 50 * bet;
            } else if(randomNum1 == randomNum2 || randomNum2 == randomNum3){
                System.out.println("LUCKY!!! YOUR BALANCE WILL be MULTIPLIED by 5 🤑🤑🤑");
                balance += 5 * bet;
            } else{
                System.out.println("SORRY, YOU LOST! 😭😭😭");
            }

            System.out.printf("Current Balance       : $%d\n", balance);
            scanner.nextLine(); // clear buffer

            if(balance == 0){
                System.out.println("Sorry, you can't continue playing, your balance is 0 😢😢😢");
                break;
            }

            System.out.print("Do you want to play again? (Y/N): ");
            confirm = scanner.nextLine();

            while(!confirm.equalsIgnoreCase("Y") && !confirm.equalsIgnoreCase("N")){
                System.out.println("Invalid input! Try again!");
                System.out.print("Do you want to play again? (Y/N): ");
                confirm = scanner.nextLine();
            }

            System.out.println();
        } while(!confirm.equalsIgnoreCase("N"));

        if(balance != 0){
            System.out.printf("\nFinal Balance: $%d\n", balance);
            System.out.println("Thanks for playing! 😃😉😆");
        }

        scanner.close();
    }
}
