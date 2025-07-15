import java.util.Random;
import java.util.Scanner;

public class Chap37RockPaperScissors {
    public static void main(String[] args){
        Random random = new Random();

        int computerMove = random.nextInt(1, 4);
        int playerMove;
        String computerMoveAscii;
        String confirm;

        if(computerMove == 1){
            computerMoveAscii = """
              
                    _______
                ---'   ____)
                      (_____)
                      (_____)
                      (____)
                ---.__(___)
               """;
        } else if(computerMove == 2){
            computerMoveAscii = """
              
                    ________
                ---'    ____)____
                           ______)
                          _______)
                         _______)
                ---.__________)
               """;
        } else{
            computerMoveAscii = """
               
                ---'---)________
                          ______)
                       __________)
                      (____)
                ---.__(___)
               """;
        }

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("************************");
            System.out.println("ROCK PAPER SCISSORS GAME");
            System.out.println("************************");

            System.out.println("""
                      (1)
                    _______
                ---'   ____)
                      (_____)
                      (_____)
                      (____)
                ---.__(___)
                """);

            System.out.println("""
                      (2)
                    ________
                ---'    ____)____
                           ______)
                          _______)
                         _______)
                ---.__________)
                """);

            System.out.println("""
                      (3)
                ---'---)________
                          ______)
                       __________)
                      (____)
                ---.__(___)
                """);

            System.out.print("Choose your move: ");
            playerMove = scanner.nextInt();

            while(playerMove < 1 || playerMove > 3){
                System.out.println("Invalid input!");
                System.out.print("Choose your move: ");
                playerMove = scanner.nextInt();
            }
            scanner.nextLine(); // clear buffer input

            if(playerMove == computerMove){
                System.out.printf("Computer choose: %s\n", computerMoveAscii);
                System.out.println("*******");
                System.out.println(" DRAW! ");
                System.out.println("*******");
            } else if(playerMove == 2 && computerMove == 1 || playerMove == 3 && computerMove == 2 || playerMove == 1 && computerMove == 3){
                System.out.printf("Computer choice: %s\n", computerMoveAscii);
                System.out.println("**********");
                System.out.println(" YOU WIN! ");
                System.out.println("**********");
            } else{
                System.out.printf("Computer choice: %s\n", computerMoveAscii);
                System.out.println("***********");
                System.out.println(" YOU LOSE! ");
                System.out.println("***********");
            }

            System.out.println("Press any key to play again!");
            System.out.println("Press N if you want to quit!");
            System.out.print("Confirm: ");
            confirm = scanner.nextLine();

            System.out.println();

        } while(!confirm.equalsIgnoreCase("N"));

        System.out.println("Thanks for playing :)");

        scanner.close();
    }
}
