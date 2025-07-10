import java.util.Scanner;

public class Chap14Substrings {
    public static void main(String[] args){
        // .substring() = a method used to extract a portion of a string
        //                .substring(start, end)

        String email, username, domain;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
            username = email.substring(0, email.indexOf("@")); // take only username from the email
            domain = email.substring(email.indexOf("@") + 1); // take only domain from the email

            System.out.printf("\nUsername: %s", username);
            System.out.printf("\nDomain : %s", domain);
        } else {
            System.out.println("Invalid email, please use @ sign!");
        }

        scanner.close();
    }
}
