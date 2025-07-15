import java.util.Scanner;

public class Chap21WhileLoops {
    public static void main(String[] args){
        /*
            while loop = repeat some code forever, while some condition remains true
         */

        String name;
        int num;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter ur name: ");
        name = scanner.nextLine();

        while (name.isEmpty()){
            System.out.println("Name can't be empty!");
            System.out.print("Enter ur name: ");
            name = scanner.nextLine();
        }

        do{
            System.out.print("Pick a number between 1-10: ");
            num = scanner.nextInt();
        } while(num < 1 || num > 10);

        System.out.printf("\nHello, %s!", name);
        System.out.printf("\nYou pick %d", num);

        scanner.close();
    }
}
