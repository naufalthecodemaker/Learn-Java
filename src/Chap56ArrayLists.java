import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Chap56ArrayLists {
    public static void main(String[] args){
        // ArrayList = a resizeable array that stores objects (autoboxing).
        //             Arrays are fixed in size, but ArrayLists can change.


        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Double> list2 = new ArrayList<>();
        ArrayList<String> fruits = new ArrayList<>();

        // The size of array is not fixed
        list1.add(3);
        list1.add(1);
        list1.add(2);

        list2.add(3.2);
        list2.add(2.3);
        list2.add(1.2);

        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Banana");
        fruits.add("Coconut");

        fruits.remove(2);
        fruits.set(0, "pineapple");

        System.out.println(list1);
        System.out.println(list2);
        System.out.println(fruits.getFirst()); // get the first index (0)
        System.out.println(fruits.get(1));

        System.out.println(fruits.size());

        Collections.sort(fruits); // sort in alphabetical order
        System.out.println(fruits);

        for(String fruit : fruits){ // for every fruit in fruits array
            System.out.println(fruit);
        }

        // exercise
        System.out.println();
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food u would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine(); // clear buffer input

        for(int i = 1; i <= numOfFood; i++){
            System.out.print("Enter food #" + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println("You ordered: ");
        System.out.print(foods);

        scanner.close();
    }
}
