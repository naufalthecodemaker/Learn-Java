

public class Chap26Methods {
    public static void main(String[] args){
        // method = a block of reusable code that's executed when called()

        String name = "bro";
        int age = 25;
        double number = 3;

        happyBirthday(name, age);
        System.out.println(square(number));

    }

    static void happyBirthday(String name, int age){ // function parameter
        System.out.printf("Happy birthday to %s!\n", name);
        System.out.printf("Happy %dth birthday to you!\n", age);
        System.out.println("Happy birthday to you!");
    }

    static double square(double number){
        return number * number;
    }
}
