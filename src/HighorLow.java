import java.util.Scanner; // Import Scanner from Java
import java.util.Random; // Import Random from Java
public class HighorLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a scanner to read user input
        Random generator = new Random(); // Create a random number generator
        int guess; // Define guess value that will be initialized from user input
        String trash; // Define trash variable for any invalid input
        boolean done = false; // Initialize done variable for the do-while loop. This is set to true when the user enters a valid input
        do {
            int val = generator.nextInt(10) + 1; // Create a random int value between 1 to 10 inclusive
            System.out.println("Guess the random number from 1 to 10 in a single guess: "); // Prompts user to guess the random generated number
            if(scan.hasNextInt()) { // If the next input can be read as an int
                guess = scan.nextInt(); // Read guess value because valid input
                scan.nextLine(); // Clear the newline from the buffer
                System.out.println("The random number was "+val); // Outputs the random number
                if(guess > val) { // If the guess is greater than the random number
                    System.out.println("Your guess was too high."); // Tells user that the guess was too high
                }
                else if(guess < val) { // If the guess is less than the random number
                    System.out.println("Your guess was too low."); // Tells user that the guess was too low
                }
                else { // Otherwise (the guess must be equal to the random number)
                    System.out.println("Your guess was right!"); // Tells user that their guess was correct
                }
                done = true; // Set done to true because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                trash = scan.nextLine(); // Read the input as a String because input cannot be read as an int
                System.out.println("You entered "+trash+". Please enter a valid guess!"); // Outputs the invalid input and asks user to enter a valid guess value
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
    }
}