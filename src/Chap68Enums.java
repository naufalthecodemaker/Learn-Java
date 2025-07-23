import java.util.Scanner;

public class Chap68Enums {
    public static void main(String[] args){
        /*
            Enums/Enumerations = a special kind of class that represents a fixed set of constants.
                                 They improve code readability and are easy to maintain.
                                 More efficient with switches when comparing Strings.
         */
        Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Enter a day of the week: ");
            String response = scanner.nextLine().toUpperCase();

            Chap68DayEnum day = Chap68DayEnum.valueOf(response); // to get value from the input

            switch(day){
                case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY -> System.out.println("It's a weekday😃😆");
                case SATURDAY, SUNDAY -> System.out.println("It's the weekend😭😖");
            }
        } catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day!");
        }

        scanner.close();







    }
}
