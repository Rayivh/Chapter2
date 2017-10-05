
/**
 * Write a description of class Problem7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

// **************************************************
//   LuckyNumbers.java
//
//   To generate two random "lucky" numbers
// **************************************************
 
import java.util.Random;
 
public class LuckyNumbers
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int lucky1, lucky2; 
 
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
 
          lucky1 = generator.nextInt(70) + 30;
 
          // Generate lucky2 (a random integer between 11 and 30) using nextFloat
 
          lucky2 = generator.nextInt(70) + 30;
 
          System.out.println ("Your lucky numbers are " + lucky1 + " and " + lucky2);
        }
}
