//***************************************************************
//File: Paint.java
//
//Purpose: Determine how much paint is needed to paint the walls
//of a room given its length, width, and height
//***************************************************************
import java.lang.Math;
public class Paint
{
    
        public static void main(String[] args)
        {
            final int COVERAGE = 350;  //paint covers 350 sq ft/gal
            
            
            int length;
            int width;
            int height;
            int doors;
            int windows;
            double totalSqFt;
            double paintNeeded;
            
            //declare integers length, width, and height;
            //declare double totalSqFt;
            //declare double paintNeeded;
            length = 15;
            //Declare and initialize the length of the room
            doors = 1;
            windows = 2;
            //Declare and initialize the width of the room
            width = 11;
            //Declare and initialize the height of the room
            height = 8;
            //Compute the total square feet to be painted--think
            //about the dimensions of each wall
            totalSqFt = height * width + height * length + height * width - ((doors * 20) + (windows * 15));
            //Compute the amount of paint needed
            paintNeeded = java.lang.Math.ceil((totalSqFt/350));
            System.out.println(totalSqFt);
            //Print the length, width, and height of the room and the
            System.out.println("length " + length + " width " + width + " height " + height);
            System.out.println("Total Number of Paint needed " + paintNeeded);
            //number of gallons of paint needed.
        }
}
