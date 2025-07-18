import java.util.Scanner;

public class Chap51RuntimePolymorphism {
    public static void main(String[] args){
        // runtime polymorphism / dynamic polymorphism:
        // when the method that gets executed is decided at runtime based on the actual type of the object (depending on the user input)

        Scanner scanner = new Scanner(System.in);

        Chap51AnimalClass animal; // either be animal = new Chap51DogClass() or animal = new Chap51CatClass()

        System.out.print("Would u like a dog or a cat? (1 = dog, 2 = cat): ");
        int choice = scanner.nextInt();

        if(choice == 1){
            animal = new Chap51DogClass();
            animal.speak();
        } else if(choice == 2){
            animal = new Chap51DogClass();
            animal.speak();
        } else{
            System.out.println("Invalid input!");
        }

        scanner.close();
    }
}
