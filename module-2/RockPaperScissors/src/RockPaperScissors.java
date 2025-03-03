/* Liz Hinz - CSD402-A339 Java for Programming 
 * M2 Programming Assignment - January 19, 2025
This program generates the popular game Rock-Paper-Scissors. 
*/

import java.util.Scanner;

public class RockPaperScissors {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// Prompt user 
		System.out.print("Ready to play Rock-Paper-Scissors?");
		System.out.print("\nEnter a value of 1 for Rock, 2 for Paper, or 3 for Scissors: ");
		int inputValue = input.nextInt();
		
		// test that entry is valid
		if (inputValue < 1 || inputValue > 3) {
			System.out.println("Invalid input. Please enter either 1 for Rock, 2 for Paper, or 3 for Scissors.");
		}
		
		// computer generates number between 1 - 3. + 1 so that it never displays 0. 
		int computer = (int)(Math.random() * 3) + 1;
		
		// display computer's answer 
		if (computer == 1) {
			System.out.println("Computer chose Rock");
		} 
		else if(computer == 2) {
	      System.out.println("Computer chose Paper");
	    }
	    else {
	    	System.out.println("Computer chose Scissors");
	    }
		
		// display users answer
		if (inputValue == 1) {
			System.out.println("User chose Rock");
		}
		else if(inputValue == 2) {
		      System.out.println("User chose Paper");
		    }
		else {
	    	System.out.println("User chose Scissors");
	    }
		
		// displays a draw
		if (inputValue == computer) {
			System.out.println("It\'s a draw.");
		}
		
		// determines whether the winner or loser since paper covers rock, etc. 
        else if ((inputValue == 1 && computer == 3) || 
                   (inputValue == 2 && computer == 1) || 
                   (inputValue == 3 && computer == 2)) {
            System.out.println("You win!");
        } 
        else {
            System.out.println("Computer wins!");
        }
	}

}