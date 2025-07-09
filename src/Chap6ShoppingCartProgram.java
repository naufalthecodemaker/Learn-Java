import java.util.Scanner;

public class Chap6ShoppingCartProgram {
    public static void main(String[] args){
        // SHOPPING CART PROGRAM

        String item;
        double price, totalPrice;
        int quantity;

        Scanner scanner = new Scanner(System.in);

        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();

        System.out.print("What is the price for each?: ");
        price = scanner.nextDouble();

        System.out.print("How many would you like?: ");
        quantity = scanner.nextInt();

        totalPrice = price * quantity;

        System.out.println("\nYou have bought " + quantity + " " + item + "/s");
        System.out.println("Your total is $" + totalPrice);

        scanner.close();

    }
}
