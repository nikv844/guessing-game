import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctName = "Tommi";  // The name to guess
        
        System.out.println("Please, guess my name.");
        String guess = scanner.nextLine();
        
        if(guess.equals(correctName)) {
            System.out.println("Congratulations!");
        }
        
        scanner.close();
    }
}