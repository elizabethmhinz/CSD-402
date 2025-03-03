/*
 * Module 9 Programming Assignment created by Liz Hinz
 * for CSD402-A339: Java for Programmers 
*/
import java.util.ArrayList; 
import java.util.Scanner; 

public class StringArray {

	public static void main(String[] args) {
		// 10 string array list 
		ArrayList<String> food = new ArrayList<>();
		
		food.add("pizza");
		food.add("cheeseburger");
		food.add("alfredo");
		food.add("wings");
		food.add("hotdog");
		food.add("sandwich");
		food.add("taco");
		food.add("burrito");
		food.add("spaghetti");
		food.add("steak");
		
		// for-each loop 
		System.out.println("The foods in the array list are: ");	
		for (String i : food) {
			System.out.println(i);
		} 
		
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.println("Which element would you like to see again (0-9)? ");
			Integer index = input.nextInt();// auto-box
			
			// auto-unbox
			String selectedFood = food.get(index); 
			System.out.println(selectedFood);
			
		} catch(IndexOutOfBoundsException e){
			System.out.println("\nOut of Bounds");
			
		} catch(Exception e) {
			System.out.println("Invalid input. Please enter a valid entry.");
			
		} finally {
		    input.close();
	}
  }
}