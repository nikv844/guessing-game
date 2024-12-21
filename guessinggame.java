import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctName = "Tommi";  // The name to guess
        int guesses = 0;  // Counter for number of guesses
        
        while(true) {
            System.out.println("Please, guess my name.");
            String guess = scanner.nextLine();
            guesses++;
            
            if(guess.equals(correctName)) {
                System.out.println("Congratulations!");
                System.out.println("Guesses: " + guesses);
                break;
            } else {
                System.out.println("Do you want to quit (y/n) ?");
                String quit = scanner.nextLine();
                if(quit.equals("y")) {
                    break;
                }
            }
        }
        
        scanner.close();
    }
}