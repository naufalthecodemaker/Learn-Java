public class Chap2Variables {
    public static void main(String[] args){
        /* Two types of variables in Java
            1. Primitive -> simple value stored directly in memory (stack)
            2. Reference -> memory address (stack) that points to the (heap)

            Primitive variables -> int, double, char, boolean
            Reference variables -> string, array, object
         */

        int age = 18;
        System.out.println("I'm " + age + " years old");

        double GPA= 3.81;
        System.out.println("My GPA is " + GPA);

        char grade = 'A';
        System.out.println("I like grade " + grade);

        boolean isStudent = true;
        System.out.println("Login Successfully!");

        String name = "Naufal Rahman";
        System.out.println("Hello, " + name + "!");
    }
}
