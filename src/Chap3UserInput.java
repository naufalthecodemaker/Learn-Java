import java.util.Scanner; // import package

public class Chap3UserInput {
    public static void main(String[] args){
        /*
        Scanner scanner = new Scanner(System.in); // adds new object called scanner

        System.out.print("Enter your age                   : ");
        int age = scanner.nextInt(); // for integer input
        scanner.nextLine();  // disappear the newline character in the input buffer

        System.out.print("Enter your name                  : ");
        String name = scanner.nextLine(); // for string input

        System.out.print("GPA                              : ");
        double gpa = scanner.nextDouble(); // for double input

        System.out.print("Are you a student? (true/false)  : ");
        boolean isStudent = scanner.nextBoolean(); // for boolean input;

        System.out.println();

        System.out.println("Hello, " + name + "!");
        System.out.println("You're " + age + " years old");
        System.out.println("Your GPA is " + gpa);
        if(isStudent){
            System.out.println("You're a student here!");
        } else{
            System.out.println("You're NOT a student here!");
        }

        scanner.close(); // always close scanner
        */

        // Calculate area of a triangle;
        double base = 0;
        double height = 0;
        double area;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Triangle Area Calculator");

        System.out.print("Base      : ");
        base = scanner.nextDouble();

        System.out.print("Height    : ");
        height = scanner.nextDouble();

        area = base * height / 2;
        System.out.println("Area      : " + area + " m²");

        scanner.close();
    }
}
