/*
 *
 * Professor Darrell Payne
 * Bellevue University
 *
 */
/*
 * Nested for Loops
 */
public class Example_301{

  public static void main(String [] args){

    for(int i = 0; i < 10; ++i){

      for(int j = 0; j < 10; ++j){

        System.out.printf("%4d", (i * j));
      }

      System.out.println();
    }
  }
}