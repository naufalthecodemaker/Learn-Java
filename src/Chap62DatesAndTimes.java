import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Chap62DatesAndTimes {
    public static void main(String[] args){
        // LocalDate, LocalTime, LocalDateTime, UTC timestamp

        LocalDate date1 = LocalDate.now();
        LocalTime date2 = LocalTime.now();
        LocalDateTime dateTime = LocalDateTime.now();
        Instant instant = Instant.now();

        System.out.println(date1);
        System.out.println(date2);
        System.out.println(dateTime);
        System.out.println(instant); // current time in UTC

        // custom format
        LocalDateTime dateTime1 = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String newDateTime = dateTime1.format(formatter);
        System.out.println(newDateTime);

        // custom date time object
        LocalDateTime date3 = LocalDateTime.of(2024, 12, 25, 12, 0, 0);
        LocalDateTime date4 = LocalDateTime.of(2025, 1, 1, 0, 0, 0);
        System.out.println(date3);
        System.out.println(date4);

        if(date3.isBefore(date4)){
            System.out.println(date3 + " is earlier than " + date4);
        } else if(date3.isAfter(date4)){
            System.out.println(date3 + " is later than " + date4);
        } else if(date3.isEqual(date4)){
            System.out.println(date3 + " is equal to " + date4);
        }
    }
}
