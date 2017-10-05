
/**
 * Write a description of class Problem8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
 
public class RollingDice
{
   public static void main (String[] args)
   {
          Random generator = new Random();
          int dice1, dice2; 
 
          // Generate lucky1 (a random integer between 50 and 79) using the nextInt method
 
          dice1 = (int) (generator.nextFloat() * 7) + 1 ;
 
          // Generate lucky2 (a random integer between 11 and 30) using nextFloat
 
          dice2 = (int) (generator.nextFloat() * 7) + 1 ;
          int totalroll;
          totalroll = dice1 + dice2;
          System.out.println ("Your dice rolls are " + dice1 + " and " + dice2);
          System.out.println ("Added together, you rolled a " + totalroll);
        }
}

