import java.util.Scanner;

public class Chap19CalculatorProgram {
    public static void main (String[] args){
        double firstNum, secondNum, result = 0;
        char operator;
        boolean validOperation = true;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number            : ");
        firstNum = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^) : ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter the second number           : ");
        secondNum = scanner.nextDouble();

        switch (operator){
            case '+' -> result = firstNum + secondNum;
            case '-' -> result = firstNum - secondNum;
            case '*' -> result = firstNum * secondNum;
            case '/' -> {
                if(secondNum == 0){
                    System.out.println("Can't divide by 0");
                    validOperation = false;
                } else {
                    result = firstNum / secondNum;
                }
            }
            case '^' -> result = Math.pow(firstNum, secondNum);
            default -> {
                System.out.println("Invalid operators!");
                validOperation = false;
            }
        }

        if(validOperation){
            System.out.printf("\nResult                            : %f", result);
        }

        scanner.close();
    }
}
