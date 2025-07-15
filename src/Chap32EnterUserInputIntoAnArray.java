import java.util.Scanner;

public class Chap32EnterUserInputIntoAnArray {
    public static void main(String[] args){
        String[] foods;
        int numOfFood;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many food do u want: ");
        numOfFood = scanner.nextInt();
        scanner.nextLine(); // clear the scanner

        foods = new String[numOfFood];

        for(int i = 0; i < foods.length; i++){
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        System.out.println("\nYou ordered: ");
        for(String food: foods){
            System.out.println(food);
        }

        scanner.close();
    }
}
