import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;


public class Chap71AlarmClock {
    public static void main(String[] args){
        // JAVA ALARM CLOCK

        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime alarmTime = null;
        String filePath = "src\\Tomorrow's Light - Telecasted.wav";

        while(alarmTime == null){
            try{
                System.out.println("Current time: " + LocalTime.now().format(formatter));
                System.out.print("Enter an alarm time (HH:MM:SS): ");
                String inputTime = scanner.nextLine();

                LocalTime tempTime = LocalTime.parse(inputTime, formatter);

                while(LocalTime.now().isAfter(tempTime)){
                    System.out.println("\nCurrent time: " + LocalTime.now().format(formatter));
                    System.out.println("The alarm time must be after the current time!");
                    System.out.print("Enter an alarm time (HH:MM:SS): ");
                    tempTime = LocalTime.parse(scanner.nextLine());
                }
                alarmTime = tempTime;
                System.out.println("Alarm set for " + alarmTime);

            } catch(DateTimeParseException e){
                System.out.println("Invalid format. Please use HH:MM:SS!\n");
            }
        }

        Chap71AlarmClockClass alarmClock = new Chap71AlarmClockClass(alarmTime, filePath, scanner);
        Thread alarmThread = new Thread(alarmClock);
        alarmThread.start();
    }
}
