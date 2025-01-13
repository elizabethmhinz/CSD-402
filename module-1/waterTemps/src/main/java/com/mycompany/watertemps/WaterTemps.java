/* @author Liz Hinz for CSD-402:A339 - Assignment 1.3 
This program calculates the energy needed to heat water from an initial
temperature to a final temperature. The program prompts the user to enter the
amount of water in kilograms and the initial and final temperature of the water.
The formula for this program is Q = waterMass ( finalTemperature – initialTemperature ) x 4184
waterMass is water weight in kilograms. finalTemperature and initialTemperature are temperatures
in Celsius. Q is the results in Joules. 
 */
import java.util.Scanner; //
public class WaterTemps {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Declare water mass in kilograms 
        System.out.print("Enter the amount of water in kilograms: ");
        double kilograms = input.nextDouble();
        
        // Declare initial temperature in Celsius
        System.out.print("Enter the initial temperature in Celsius: ");
        double initialTemperature = input.nextDouble();
        
        // Declare final temperature in Celsius
        System.out.print("Enter the final temperature in Celsius: ");
        double finalTemperature = input.nextDouble();
        
        // Compute Joules 
        double energy = kilograms * (finalTemperature - initialTemperature)* 4184;
        
        // Display results in Joules
        System.out.println("The energy needed is " + energy);
    }
}
