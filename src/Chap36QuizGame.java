import java.util.Scanner;

public class Chap36QuizGame {
    public static void main(String[] args){
        // JAVA QUIZ GAME
        String[] questions = {"What is the main function of a router?",
                              "Which part of the computer is considered the brain?",
                              "What year was Facebook launched?",
                              "Who is known as the father of computers?",
                              "What was the first programming language?"};

        String[][] options = {{"A. Storing files", "B. Encrypting data", "C. Directing internet traffic", "D. Managing passwords"},
                              {"A. CPU", "B. Hard Drive", "C. RAM", "D. GPU"},
                              {"A. 2000", "B. 2004", "C. 2006", "D. 2010"},
                              {"A. Steve Jobs", "B. Bill Gates", "C. Alan Turing", "D. Charles Babbage"},
                              {"A. COBOL", "B. C", "C. Fortran", "D. Assembly"}};

        String[] answers = {"C", "A", "B", "D", "C"};
        int score = 0;
        String guess;

        Scanner scanner = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("******************************\n");

        for(int i = 0; i < questions.length; i++){
            System.out.println(questions[i]);

            for(String option : options[i]){ // display every option in each array options
                System.out.println(option);
            }

            System.out.print("Your guess: ");
            guess = scanner.nextLine();

            if(guess.equalsIgnoreCase(answers[i])){
                System.out.println("********");
                System.out.println("CORRECT!");
                System.out.println("********");
                score++;
            } else{
                System.out.println("********");
                System.out.println(" WRONG! ");
                System.out.println("********");
            }

            System.out.println();
        }

        System.out.println("*********************************");
        System.out.printf("Your final score is: %d out of %d\n", score, questions.length);
        System.out.println("*********************************");

        scanner.close();
    }
}
