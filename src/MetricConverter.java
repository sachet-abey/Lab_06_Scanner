import java.util.Scanner; // Import Scanner from Java
public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a scanner to read user input
        double meters = 0; // Initialize a variable for the meters user input
        String trash; // Define trash variable for any invalid input
        boolean done = false; // Initialize done variable for the do-while loop. This is set to true when the user enters a valid input
        do {
            System.out.println("Enter a measurement in meters: "); // Prompts user to enter a measurement in meters
            if (scan.hasNextDouble()) { // If the next input can be read as a double
                meters = scan.nextDouble(); // Read meters value because valid input
                scan.nextLine(); // Clear the newline from the buffer
                done = true; // Set done to true because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                trash = scan.nextLine(); // Read the input as a String because input cannot be read as a double
                System.out.println("You entered "+trash+". Please enter a valid measurement in meters!"); // Outputs the invalid input and asks user to enter a valid meters value
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
        double miles = meters * 0.000621371, feet = meters * 3.28084, inches = meters * 39.3701; // Calculate the approximate miles, feet, and inches using the given meters value
        System.out.println("The measurement is equivalent to "+miles+" miles, "+feet+" feet, and "+inches+" inches. (approx.)"); // Output calculations/results
    }
}