import java.util.Scanner;

public class Chap15WeightConverter {
    public static void main(String[] args){
        // HEIGHT CONVERSION PROGRAM

        int option;
        double weight, newWeight;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert lbs to kgs");
        System.out.println("2: Convert kgs to lbs");

        System.out.print("Choose an option: ");
        option = scanner.nextInt();

        if(option == 1){
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * (1 / 2.20462);
            System.out.printf("The new weight in kgs is: %.2f", newWeight);
        } else if(option == 2){
            System.out.print("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is: %.2f", newWeight);
        } else{
            System.out.println("\nInvalid option!");
        }

        scanner.close();
    }
}
