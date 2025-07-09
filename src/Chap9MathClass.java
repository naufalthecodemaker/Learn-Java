import java.util.Scanner;

public class Chap9MathClass {
    public static void main(String[] args){
        /*
        System.out.println(Math.PI);
        System.out.println(Math.E);

        double result;
        result = Math.pow(2, 3);
        result = Math.abs(-5);
        result = Math.sqrt(9);
        result = Math.round(3.14);
        result = Math.ceil(3.14); // round up
        result = Math.floor(3.99); // round down
        result = Math.max(10, 20);
        result = Math.min(10, 20);

        System.out.println(result);
        */

        double base, height, hypotenuse;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Base         : ");
        base = scanner.nextDouble();

        System.out.print("Height       : ");
        height = scanner.nextDouble();

        System.out.print("Hypotenuse   : ");
        hypotenuse = scanner.nextDouble();

        double calculateHypotenuse = Math.sqrt((Math.pow(base, 2) + (Math.pow(height, 2))));

        if(hypotenuse == calculateHypotenuse){
            System.out.println("It's a Pythagoras Triangle");
        } else{
            System.out.println("It's NOT a Pythagoras Triangle");
        }

        scanner.close();
    }
}
