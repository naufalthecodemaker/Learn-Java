import java.util.Random;

public class Chap8RandomNumbers {
    public static void main(String[] args){
        int number1;
        int number2;
        int number3;
        double number4;
        boolean isHeads;

        Random random = new Random();

        number1 = random.nextInt(0, 7); // generate random number between 0 and 7
        number2 = random.nextInt(0, 7);
        number3 = random.nextInt(0, 7);
        number4 = random.nextDouble(0, 1);
        isHeads = random.nextBoolean();

        System.out.print(number1 + " ");
        System.out.print(number2 + " ");
        System.out.println(number3);

        if(number1 == number2 && number1 == number3){
            System.out.println("JACKPOT🤑🤑🤑");
        } else{
            System.out.println("LOSER🤣🤣🤣");
        }

        if(number4 >= 0.5){
            System.out.println("\nCoin Number");
        } else{
            System.out.println("\nCoin Image");
        }

        if(isHeads){
            System.out.println("\nHEADS");
        } else{
            System.out.println("\nTAILS");
        }
    }
}
