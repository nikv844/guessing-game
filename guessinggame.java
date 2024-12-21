import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args) {
        // Create scanner for reading input
        Scanner scanner = new Scanner(System.in);
        
        // Set the name that needs to be guessed
        String secretName = "bhuvi";
        
        // Create a counter for guesses
        int numberOfGuesses = 0;
        
        // Game continues until correct guess
        boolean gameRunning = true;
        
        while(gameRunning) {
            // Ask for a guess
            System.out.println("Please, guess my name.");
            String userGuess = scanner.nextLine();
            numberOfGuesses = numberOfGuesses + 1;
            
            // Check if guess is correct
            if(userGuess.equals(secretName)) {
                System.out.println("Congratulations!");
                System.out.println("Guesses: " + numberOfGuesses);
                gameRunning = false;
            } 
            // If guess is wrong
            else {
                System.out.println("Wrong guess!");
                System.out.println("Do you want to quit (y/n) ?");
                String quitAnswer = scanner.nextLine();
                
                if(quitAnswer.equals("y")) {
                    gameRunning = false;
                }
            }
        }
        
        scanner.close();
    }
}