import java.util.Scanner; // Import Scanner from Java
import java.lang.Math; // Import Math from Java
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a scanner to read user input
        double width = 0, height = 0; // Initialize variables for the rectangle's width and height
        String trash; // Define trash variable for any invalid input
        boolean done = false; // Initialize done variable for the do-while loop. This is set to true when the user enters a valid input
        do {
            System.out.println("Enter the width of the rectangle: "); // Prompts user to enter the width of the rectangle
            if(scan.hasNextDouble()) { // If the next input can be read as a double
                width = scan.nextDouble(); // Read rectangle's width because valid input
                scan.nextLine(); // Clear the newline from the buffer
                done = true; // Set done to true because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                trash = scan.nextLine(); // Read the input as a String because input cannot be read as a double
                System.out.println("You entered "+trash+". PLease enter a valid width value!"); // Outputs the invalid input and asks user to enter a valid width value
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
        done = false;
        do {
            System.out.println("Enter the height of the rectangle: "); // Prompts user to enter the height of the rectangle
            if(scan.hasNextDouble()) { // If the next input can be read as a double
                height = scan.nextDouble(); // Read rectangle's height because valid input
                scan.nextLine(); // Clear the newline from the buffer
                done = true; // Set done to true because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                trash = scan.nextLine(); // Read the input as a String because input cannot be read as a double
                System.out.println("You entered "+trash+". Please enter a valid height value!"); // Outputs the invalid input and asks user to enter a valid height value
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
        double area = width * height, perimeter = 2 * width + 2 * height, diagonal = Math.sqrt(width * width + height * height); // Calculate the area, perimeter, and diagonal of the rectangle using Java's arithmetic operators and Math class
        System.out.println("The rectangle has area "+area+", perimeter "+perimeter+", and diagonal "+diagonal); // Output calculations/results
    }
}