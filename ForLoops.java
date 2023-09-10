/**
 * @author Adam Zieman
 * Date: October 21, 2021
 * 
 * Course: CSCI 241 (Computer Science 1)
 * Assignment: 5.3
 *
 * Description:
 * This program is designed for the programmer to practice for-loops.
 *
 * Known bugs: none
 */

import java.util.Scanner;

public class ForLoops
{
    public static void main (String[] args) {
        // Declares a variable to standard input
        Scanner keyboard = new Scanner(System.in);

        // Print the section A header
        System.out.println("          ------ Section A ------");

        // Asks the user to input an integer
        System.out.print("Please enter a positive number: ");
        int subtractingNumber = keyboard.nextInt();

        // Print a description for section A
        System.out.println("(for) Loop will subtract the values between 1 and the entered number from 100.");
        System.out.println("========================================================================");

        // Declare and initialize a variable at one-hundred which will be subtracted from by the
        // user input value
        int numDifference = 100;

        // Declare and initialize the condition variable to the value input by the user
        // The condition variable decrements by one
        for (int i = subtractingNumber; i > 0; i--) {
            // The value of numDifference is subtracting the condition variable value
            numDifference -= i;
        }

        // Print the value
        System.out.println("Values 1 through 4 subtracted from 100 = " + numDifference);

        // Prints a line of hyphens between sections
        sectionDivider();

        // Prints a description for section B
        sectionBHeader();

        // Declare and initialize the condition variable to fourty-five
        // The condition is decremented by five, until the value is five
        for (int j = 45; j >= 5; j -= 5) {
            System.out.print(j);
            if (j > 5)
                System.out.print("<>");
        }
        
        // Prints a newline
        System.out.println();

        // Prints a line of hyphens between sections
        sectionDivider();

        // Prints a description for section C
        sectionCHeader();

        // Print table header
        System.out.printf("%13s%14s", "Pounds", "Kilograms\n");
        System.out.println("------------------------------");

        // Declare and initialize variable the hold value of kilograms
        double kilogram = 0.0;

        // Declare and initalize condition variable to five
        // The condition is incremented by five, until fourty
        for (int pound = 5; pound <= 40; pound += 5) {
            kilogram = pound * 0.453592;
            System.out.printf("%11d%13.2f\n", pound, kilogram);
        }

        // Prints a line of hyphens between sections
        sectionDivider();

        // Prints a description for section D
        sectionDHeader();

        // Print table header
        System.out.println("    Rows of Digits");
        System.out.println("---------------------");

        // Declare and initialize condition variable to one
        // The condition is incremented by one, until nine
        // Creates columns
        for (int c = 1; c <= 9; c++) {
            // Declare and initialize condition variable to zero
            // The condition is incremented by one, until six
            // Creates rows
            for (int r = 0; r < 7; r++) {
                // Declare and initialize variable that will hold a character
                String symbol = "";
                
                // associates a character to the respective value of k
                switch (c) {
                    case 1: 
                    case 9: symbol = " ";
                    break;
                    case 2:
                    case 8: symbol = ",";
                    break;
                    case 3:
                    case 7: symbol = "+";
                    break;
                    case 4:
                    case 6: symbol = "-";
                    break;
                    case 5: symbol = "=";
                    break;
                }
                
                // Print the respective row number between respective characters associated
                // to the row value
                System.out.print(symbol + c + symbol);
            }
            
            System.out.println();
        }
        
        System.out.println();

        keyboard.close();
    }

    // Prints a description for section B
    public static void sectionBHeader() {
        System.out.println("          ------ Section B ------");
        System.out.println("(for) Loop prints values 45 down to 5, separated by <> as, by 5's.");
        System.out.println("========================================================================");
    }

    // Prints a description for section C
    public static void sectionCHeader() {
        System.out.println("          ------ Section C ------");
        System.out.println("(for) Loop shows range of values representing weight measurements");
        System.out.println("      from 5 to 40 pounds.");
        System.out.println("Using increments of 5, calculates and print equivalent kilograms.");
        System.out.println("========================================================================");
    }

    // Prints a description for section D
    public static void sectionDHeader() {
        System.out.println("          ------ Section D ------");
        System.out.println("(Nested for-loop)");
        System.out.println("Starting with the digit 1, print 9 rows of digits.");
        System.out.println("Different digits will be surrounded by characters:");
        System.out.println("1 and 9 (space), 2 and 8 (comma), 3 and 7 (plus sign),");
        System.out.println("4 and 6 (hyphen), 5 (equals sign).");
        System.out.println("The outer loop will control the row number.");
        System.out.println("The inner loop will print the same value 7 times.");
        System.out.println("========================================================================");
    }

    // Prints a line of hyphens between sections
    public static void sectionDivider() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
    }
}
