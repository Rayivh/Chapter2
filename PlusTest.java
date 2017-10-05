
/**
 * Write a description of class Problem2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
// *******************************************************************
//   PlusTest.java
//
//   Demonstrate the different behaviors of the + operator
// *******************************************************************
public class PlusTest
{
    // -------------------------------------------------
    // main prints some expressions using the + operator
    // -------------------------------------------------
    public static void main ()
    {
        writeHeader();
        populateRows();
        
    }
    public static void writeHeader() {
        System.out.println ("==============================");
        System.out.println ("=Name=    Lab       Bonus    Total");
        System.out.println ("===========    ==       ==    ");
        
    }
    public static void populateRows() {
        populateOneRow("Joelele", 40, 7);
        populateOneRow("Joele", 30, 6);
        populateOneRow("Joel", 10, 5);
        populateOneRow("Joe", 00, 4);
        populateOneRow("Jo", -1, 3);
    }
    public static void populateOneRow(String name, int lab, int bonus){
        System.out.println(name +"\t" + lab + "\t" + bonus + "\t" + (lab + bonus));
    
    }
    
    
}

