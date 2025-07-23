import java.util.Scanner;

public class Chap69Threading {
    public static void main(String[] args){
        /*
            Threading = allows a program to run multiple tasks simultaneously.
                        Helps improve performance with time-consuming operations.
               Example: File I/O, network communications, or any background tasks

            How to create a Thread
            Option 1 -> Extend the Thread class (simpler)
            Option 2 -> Implement the Runnable interface (better)
         */

        Scanner scanner = new Scanner(System.in);

        Chap69MyRunnableClass myRunnable = new Chap69MyRunnableClass();
        Thread thread = new Thread(myRunnable);
        thread.setDaemon(true); // the thread is going to end as soon as our main thread is finish
        thread.start();

        System.out.println("You have 10 seconds to enter your name");
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
}
