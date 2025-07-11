import java.util.Scanner;

public class Chap17TemperatureConverter {
    public static void main(String[] args){
        double temperature, newTemperature;
        char unitToConvert;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature : ");
        temperature = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit (C or F) : ");
        unitToConvert = scanner.next().charAt(0);

        if(unitToConvert == 'C' || unitToConvert == 'c'){
            newTemperature = (5.0/9.0) * (temperature - 32);
            System.out.printf("%.2f°C", newTemperature);
        } else if(unitToConvert == 'F' || unitToConvert == 'f' ){
            newTemperature = (9.0/5.0 * temperature) + 32;
            System.out.printf("%.2f°F", newTemperature);
        } else{
            System.out.println("Invalid unit!");
        }

        scanner.close();
    }
}
