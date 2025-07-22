import java.util.Timer;
import java.util.Scanner;
import java .util.TimerTask;

public class Chap65CountDownTimer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of seconds to countdown from: ");
        int numOfSecond = scanner.nextInt();

        while(numOfSecond <= 0){
            System.out.println("The second must be more than zero!");
            System.out.print("Enter number of seconds to countdown from: ");
            numOfSecond = scanner.nextInt();
        }

        scanner.close();

        Timer timer = new Timer();
        int finalNumOfSecond = numOfSecond;
        TimerTask task = new TimerTask() {
            int count = finalNumOfSecond;
            @Override
            public void run() {
                System.out.println(count);
                count--;
                if(count < 0){
                    System.out.println("TIMES UP!!!");
                    timer.cancel();
                }
            }
        };

        timer.scheduleAtFixedRate(task, 0, 1000); // (task, delay, period)
    }
}
