import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Chap61HangmanGame {
    public static void main(String[] args){
        // JAVA HANGMAN GAME

        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            // read a file line by line
            String line;
            while((line = reader.readLine()) != null){
                words.add(line);
            }
        } catch (FileNotFoundException e){
            System.out.println("Couldn't locate file!");
        } catch (IOException e){ // SAFETY NET
            System.out.println("Something went wrong!");
        }

        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int randomIndex = random.nextInt(0, 9);

        String word = words.get(randomIndex);
        ArrayList<Character> wordState =  new ArrayList<>();
        int wrongGuesses = 0;

        for(int i = 0; i < word.length(); i++){
            wordState.add('_');
        }

        System.out.println("************************");
        System.out.println("Welcome to Java Hangman!");
        System.out.println("************************");

        do{
            System.out.print("Word: ");
            for(char c : wordState){
                System.out.print(c + " ");
            }
            System.out.println();

            System.out.print("Guess a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            if(word.indexOf(guess) >= 0){
                System.out.println("Correct guess!\n");
                for(int i = 0; i < word.length(); i++){
                    if(word.charAt(i) == guess){
                        wordState.set(i, guess);
                    }
                }
                if(!wordState.contains('_')){
                    System.out.println(getHangmanArt(wrongGuesses));
                    System.out.println("YOU WIN!");
                    System.out.printf("The word was: %s", word);
                    break;
                }
            } else{
                wrongGuesses++;
                System.out.println("Wrong guess!\n");
                System.out.println(getHangmanArt(wrongGuesses));
            }
        } while(wrongGuesses < 6);

        if(wrongGuesses == 6){
            System.out.println("GAME OVER!");
            System.out.println("YOU LOST!");
            System.out.printf("The word was: %s", word);
        }

        scanner.close();
    }

    static String getHangmanArt(int wrongGuesses){
        return switch(wrongGuesses){
            case 0 -> """
                    
                    
                    
                      """;
            case 1 -> """
                       o
                    
                    
                      """;
            case 2 -> """
                       o
                       |
                    
                      """;
            case 3 -> """
                       o
                      /|
                    
                      """;
            case 4 -> """
                       o
                      /|\\
                    
                      """;
            case 5 -> """
                       o
                      /|\\
                      /
                      """;
            case 6 -> """
                       o
                      /|\\
                      / \\
                      """;
            default -> "";
        };
    }
}
