import java.util.Arrays;

public class Chap31Arrays {
    public static void main(String[] args){
        String[] fruits = {"apple", "orange", "guava", "banana"};
        int numOfFruits = fruits.length;
        Arrays.sort(fruits); // sort an array
        // Arrays.fill(fruits, "pineapple"); // filled the array with value pineapple

        for(int i = 0; i < numOfFruits; i++){ // normal for loop
            System.out.println(fruits[i]);
        }

        System.out.println();

        for(String fruit : fruits){ // enhanced for loop => for every fruit in array fruits, do this code
            System.out.println(fruit);
        }
    }
}
