import java.util.Scanner;

public class Chap18EnhancedSwitches {
    public static void main(String[] args){
        // replacement to many else if statements

        String day;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the day: ");
        day = scanner.nextLine().toLowerCase();

        switch (day){
            case "monday", "tuesday", "wednesday", "thursday", "friday" ->
                    System.out.println("It's a weekday");
            case "saturday", "sunday" ->
                    System.out.println("It's a weekend");
            default -> System.out.println("It's not a day");
        }

        scanner.close();
    }
}
