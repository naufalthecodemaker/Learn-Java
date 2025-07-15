import java.util.Scanner;

public class Chap23ForLoops {
    public static void main(String[] args) throws InterruptedException{
        int start;

        Scanner scanner = new Scanner(System.in);

        System.out.print("How many seconds to countdown from?: ");
        start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000); // 1 second each loop
        }

        System.out.println("Happy NEW YEARR");

        scanner.close();
    }
}
