/*
 * Module 8 Programming Assignment created by Liz Hinz
 * for CSD402-A339: Java for Programmers 
*/

import java.util.ArrayList; 
import java.util.Scanner;

public class LizArrayListTest {

	public static void main(String[] args) {
		// Started with code from LiveExample 11.9 from Intro to Java textbook 
		ArrayList<Integer> list = new ArrayList<Integer>();

		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers: ");
		int value;
		
		// loop for array integers 
	    do {
	    	value = input.nextInt(); // Read a value from the input
	    	list.add(value); 
	    } while (value != 0);
	    
	    input.close();
	    
	    Integer maxValue = max(list);
	    System.out.println("The largest value in the array list is: " + maxValue);
	}
	
	
	public static Integer max(ArrayList<Integer>list) {
		if(list.isEmpty()) {
			return 0;
		}
		// initialize maxValue
		Integer maxValue = list.get(0); 
		// loop to find largest 
		for (Integer num : list) {
			if (num > maxValue) {
				maxValue = num;
			}
		}
		return maxValue;
		
	}
}