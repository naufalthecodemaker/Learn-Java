import javax.sound.sampled.*;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;
import java.util.Scanner;

public class Chap71AlarmClockClass implements Runnable{
    private final LocalTime alarmTime;
    private final String filePath;
    private final Scanner scanner;

    Chap71AlarmClockClass(LocalTime alarmTime, String filePath, Scanner scanner){
        this.alarmTime = alarmTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }

    @Override
    public void run(){
        while(LocalTime.now().isBefore(alarmTime)){
            try {
                Thread.sleep(1000);

                LocalTime now = LocalTime.now();

                System.out.printf("\r%02d:%02d:%02d", now.getHour(), now.getMinute(), now.getSecond());
            } catch (InterruptedException e) {
                System.out.println("Thread was interrupted!");
            }
        }

        System.out.println("\n**ALARM NOISES**");
        playSound(filePath);
    }

    private void playSound(String filePath){
        File audioFile = new File(filePath);

        try(AudioInputStream audioStream = AudioSystem.getAudioInputStream(audioFile)){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

            System.out.print("Press *ENTER* to stop the alarm!");
            scanner.nextLine();
            clip.stop();

            scanner.close();
        } catch (UnsupportedAudioFileException e) {
            System.out.println("Audio file format is not supported!");
        } catch (IOException e) {
            System.out.println("Error reading audio file!");
        } catch (LineUnavailableException e) {
            System.out.println("Audio is unavailable!");
        }
    }
}
