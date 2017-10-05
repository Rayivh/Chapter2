
/**
 * Write a description of class Problem4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// **************************************************
//   StringPlay.java
//
//   Play with String objects
// **************************************************
public class StringPlay
{
    public static void main (String[] args)
    {
        String college = new String ("PoDunk College");
        String town = new String ("Anytown, USA");
       
      
          int stringLength = college.length();
          String change1, change2, change3;
 
          // part (b)
 
          System.out.println (college + " contains " + stringLength + " characters.");
 
          change1 = college.toUpperCase(); // part (c)
          System.out.println ("The final string is " + change1);
          change2 = change1.replace("O","*"); // part (d)
          System.out.println ("The final string is " + change2);
          change3 = college + town; // part (e)
 
          System.out.println ("The final string is " + change3);
        }
}
