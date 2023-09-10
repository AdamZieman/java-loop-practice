/**
 * @author Adam Zieman
 * Date: October 21, 2021
 * 
 * Course: CSCI 241 (Computer Science 1)
 * Assignment: 5.2
 *
 * Description:
 * This program is designed for the programmer to practice do-while-loops.
 *
 * Known bugs: none
 */

import java.util.Scanner;

public class DoWhileLoops
{
    public static void main (String[] args) {
        // Declares a variable to standard input
        Scanner keyboard = new Scanner(System.in);
        
        // Prints a description for section A
        sectionAHeader();
        
        // Declare the condition variable
        int factorSixNumber;
        
        
        // Loop will ask the user to input an integer that is a factor of six and continue to
        // execute until the user inputs an integer that is a factor of six
        do {
            // Asks the user to input an integer that is a factor of six
            System.out.print("Enter a number that is a multiple of 6: ");
            factorSixNumber = keyboard.nextInt();
            
            // Print an error message if the integer input by the user is not a factor of six
            // Otherwise print the factor of six 
            if (factorSixNumber % 6 != 0)
                System.out.println("Error: number must be a multiple of 6.");
            else
                System.out.println("Multiple of 6 entered: " + factorSixNumber);
                
        } while (factorSixNumber % 6 != 0);
        
        // Prints a line of hyphens between sections
        sectionDivider();
        
        // Prints a description for section B
        sectionBHeader();
        
        // Declare the condition variable
        int numFourToFourteen;
        
        // Loop will ask the user to input an integer that is between four and fourteen and
        // continue to execute until the user inputs an integer in range.
        do {
            // Asks the user to input an integer that is between four and fourteen
            System.out.print("Enter a number between 4 and 14, inclusive: ");
            numFourToFourteen = keyboard.nextInt();
            
            // Print an error message if the integer input was not between four and fourteen
            // Otherwise print the inclusive integer
            if (numFourToFourteen < 4 || numFourToFourteen > 14)
                System.out.println("Error: number must be between 4 and 14 inclusive.");
            else
                System.out.println("The chosen number is: " + numFourToFourteen);
        } while (numFourToFourteen < 4 || numFourToFourteen > 14);
        
        System.out.println();

        keyboard.close();
    }
    
    // Prints a description for section A
    public static void sectionAHeader() {
        System.out.println("          ------ Section A ------");
        System.out.println("(do-while) User enters number that is a multiple of 6.");
        System.out.println("After the loop, it prints the final accepted number.");
        System.out.println("========================================================================");
    }
    
    // Prints a description for section B
    public static void sectionBHeader() {
        System.out.println("          ------ Section B ------");
        System.out.println("(do-while) User enters number between 4 and 14, inclusive.");
        System.out.println("After the loop, it prints the final accepted number.");
        System.out.println("========================================================================");
    }
    
    // Prints a line of hyphens between sections
    public static void sectionDivider() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
    }
}
