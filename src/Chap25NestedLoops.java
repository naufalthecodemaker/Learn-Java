import java.util.Scanner;

public class Chap25NestedLoops {
    public static void main(String[] args){
        int rows, columns;
        char symbol;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        columns = scanner.nextInt();

        System.out.print("Enter the symbol to use: ");
        symbol = scanner.next().charAt(0);

        for(int i = 0; i < rows; i++){
            System.out.println();
            for(int j = 0; j < columns; j++){
                System.out.print(symbol);
            }
        }

        scanner.close();
    }
}
