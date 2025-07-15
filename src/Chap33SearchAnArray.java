import java.util.Scanner;

public class Chap33SearchAnArray {
    public static void main(String[] args){
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        int target1;
        String target2;
        boolean isFoundNum = false;
        boolean isFoundFruit = false;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to search for: ");
        target1 = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter a fruit to search for: ");
        target2 = scanner.nextLine();


        for(int i = 0; i < numbers.length; i++){
            if(target1 == numbers[i]){
                System.out.printf("\nNumber found at index: %d\n", i);
                isFoundNum = true;
                break;
            }
        }

        if(!isFoundNum){
            System.out.println("\nNumber NOT found in the array\n");
        }

        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target2)){
                System.out.printf("Fruit found at index: %d", i);
                isFoundFruit = true;
                break;
            }
        }

        if(!isFoundFruit){
            System.out.println("Fruit NOT found in the array");
        }

        scanner.close();
    }
}
