import java.util.Timer;
import java.util.TimerTask;

public class Chap64Timertasks {
    public static void main(String[] args){
        /*
            TimerTask = represents the task that will be executed by the Timer
                        We will extend the TimerTask class to define our task
                        Create a subclass of TimerTask and @Override run()
         */

        Timer timer = new Timer();
        TimerTask task = new TimerTask(){
            int count = 3;

          @Override
          public void run(){
              System.out.println("Hello");
              count --;
              if(count <= 0){
                  System.out.println("TASK COMPLETE!");
                  timer.cancel(); // stop the timer
              }
          }
        };

        // timer.schedule(task, 3000); // after 3 seconds, we'll output hello
        timer.schedule(task, 3000, 1000); // print hello every 1 second after 3-second delay

    }
}
