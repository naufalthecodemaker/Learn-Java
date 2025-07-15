import java.util.Scanner;

public class Chap29BankingProgram {
    public static void main(String[] args){
        // JAVA BANKING PROGRAM
        int option;
        double balance = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            System.out.print("Enter your choice (1-4): ");
            option = scanner.nextInt();

            switch (option){
                case 1 -> showBalance(balance);
                case 2 -> {
                    System.out.println("***************");
                    balance = makeDeposit(balance, scanner);
                    System.out.println("***************");
                }
                case 3 -> {
                    System.out.println("***************");
                    balance = withdrawal(balance, scanner);
                    System.out.println("***************");
                }
                case 4 -> {
                    System.out.println("*****************************");
                    System.out.println("Thank you, have a nice day :)");
                    System.out.println("*****************************");
                }
                default -> {
                    System.out.println("**************************");
                    System.out.println("Invalid option! Try again!");
                    System.out.println("**************************");
                }
            }
        } while(option != 4);

        scanner.close();
    }

    static void showBalance(double balance){
        System.out.println("***************");
        System.out.printf("$%.2f\n", balance);
        System.out.println("***************");
    }

    static double makeDeposit(double balance, Scanner scanner){
        System.out.print("Enter an amount to be deposited: ");
        double deposit = scanner.nextDouble();

        if(deposit < 0){
            System.out.println("Deposit can't be less than 0!");
        } else{
            balance += deposit;
        }

        return balance;
    }

    static double withdrawal(double balance, Scanner scanner){
        System.out.print("Enter amount to be withdrawn: ");
        double withdraw = scanner.nextDouble();

        if(withdraw > balance){
            System.out.println("Sorry, your balance is not enough :(");
        } else if(withdraw < 0){
            System.out.println("Withdraw can't be less than 0!");
        } else{
            balance -= withdraw;
        }

        return balance;
    }
}
