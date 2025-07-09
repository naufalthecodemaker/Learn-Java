import java.util.Scanner;

public class Chap7IfStatement {
    public static void main(String[] args){
        int age;
        String name;
        boolean isStudent;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age : ");
        age = scanner.nextInt();

        System.out.print("Are u a student (true/false): ");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()){ // isEmpty method for check if user didn't input the string
            System.out.println("\nYou didn't enter your name! 😡");
        } else{
            System.out.println("\nHello, " + name + "! 😊");
        }

        if(age >= 65){
            System.out.println("You're old!");
        } else if(age >= 18){
            System.out.println("You're an adult!");
        } else if(age < 0 ){
            System.out.println("You haven't been born yet!");
        } else if(age == 0){
            System.out.println("You just born!");
        } else{
            System.out.println("You're NOT an adult!");
        }

        if(isStudent){
            System.out.println("You are a student!");
        } else{
            System.out.println("You are NOT a student!");
        }

        scanner.close();
    }
}
