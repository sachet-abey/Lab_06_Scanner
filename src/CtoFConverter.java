import java.util.Scanner; // Import Scanner from Java
public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a scanner to read user input
        double celsius; // Define celsius variable that will be initialized from user input
        String trash; // Define trash variable for any invalid user input
        boolean done = false; // Initialize done variable for the do-while loop. This is set to true when the user enters a valid input
        do {
            System.out.println("Enter a temperature in celsius: "); // Prompts user to enter temperature in celsius
            if(scan.hasNextDouble()) { // If the next input can be read as a double
                celsius = scan.nextDouble(); // Read celsius value because valid input
                double farenheit = 1.8 * celsius + 32; // Calculate farenheit value by multiplying the celsius value by 9/5 (1.8) and then adding 32
                System.out.println("The temperature in farenheit is "+farenheit); // Output the farenheit calculation/result
                scan.nextLine(); // Clears the newline from the buffer
                done = true; // Set done to true because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                trash = scan.nextLine(); // Read the input as a String because input cannot be read as a double
                System.out.println("You entered "+trash+". Please enter a valid temperature value!"); // Outputs the invalid input and asks user to enter a valid temperature value
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
    }
}
