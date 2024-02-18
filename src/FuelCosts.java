import java.util.Scanner; // Import Scanner from Java
public class FuelCosts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Create a scanner to read user input
        double gallons = 0, fuelEfficiency = 0, gasPrice = 0; // Initialize variables for the number of gallons, fuel efficiency, and the gas price
        String trash; // Define trash variable for any invalid input
        boolean done = false; // Initialize done variable for the do-while loop. This is set to true when the user enters a valid input
        do {
            System.out.println("Enter the number of gallons of gas in the tank: "); // Prompts user to enter number of gallons
            if(scan.hasNextDouble()) { // If the next input can be read as a double
                gallons = scan.nextDouble(); // Read number of gallons value because valid input
                scan.nextLine(); // Clears the newline from the buffer
                done = true; // Set done to true because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                trash = scan.nextLine(); // Read the input as a String because input cannot be read as a double
                System.out.println("You entered "+trash+". Please enter a valid value!"); // Outputs the invalid input and asks user to enter a valid value
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
        done = false;
        do {
            System.out.println("Enter the fuel efficiency in miles per gallon: "); // Prompts user to enter fuel efficiency
            if(scan.hasNextDouble()) { // If the next input can be read as a double
                fuelEfficiency = scan.nextDouble(); // Read fuel efficiency value because valid input
                scan.nextLine(); // Clears the newline from the buffer
                done = true; // Set done to true because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                trash = scan.nextLine(); // Read the input as a String because input cannot be read as a double
                System.out.println("You entered "+trash+". Please enter a valid value!"); // Outputs the invalid input and asks user to enter a valid value
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
        done = false;
        do {
            System.out.println("Enter the price of gas per gallon: "); // Prompts user to enter gas price
            if(scan.hasNextDouble()) { // If the next input can be read as a double
                gasPrice = scan.nextDouble(); // Read gas price value because valid input
                scan.nextLine(); // Clears the newline from the buffer
                done = true; // Set done to true because we are finished - no more looping needed because the user entered a valid input
            }
            else {
                trash = scan.nextLine(); // Read the input as a String because input cannot be read as a double
                System.out.println("You entered "+trash+". Please enter a valid value!"); // Outputs the invalid input and asks user to enter a valid value
            }
        }
        while (!done); // Keeps looping when done is false (done becomes true when user enters a valid input)
        double costHundredMiles = gasPrice * 100/fuelEfficiency, howFar = gallons * fuelEfficiency; // Calculate the cost for 100 miles and how far the car can go
        System.out.println("The cost per 100 miles is "+costHundredMiles+" and the car can go "+howFar+" miles with the gas in the tank."); // Output calculations/results
    }
}