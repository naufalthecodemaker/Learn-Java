public class Chap70Multithreading {
    public static void main(String[] args) {
        /*
            Multithreading = enables a program to run multiple threads concurrently.
                             Thread = a set of instructions that run independently.
                             Useful for background tasks or time-consuming operations
         */

        // multithreading
        Thread thread1 = new Thread(new Chap70MyRunnableClass("ping"));
        Thread thread2 = new Thread(new Chap70MyRunnableClass("pong"));

        System.out.println("GAME START!");

        thread1.start();
        thread2.start();

        try {
            // wait for the thread to finish, before display game over
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread was interrupted!");
        }

        System.out.println("GAME OVER!");
    }
}
