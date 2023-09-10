/**
 * @author Adam Zieman
 * Date: October 21, 2021
 * 
 * Course: CSCI 241 (Computer Science 1)
 * Assignment: 5.1
 *
 * Description:
 * This program is designed for the programmer to practice while-loops.
 *
 * Known bugs: none
 */

import java.util.Scanner;

public class WhileLoops {
    public static void main (String[] args) {
        // Prints a description for section A
        sectionAHeader();

        // Prints the string "October" without starting a new line
        System.out.print("October");

        // Declare and Initialize the condition variable
        int repeat = 0;

        // While loop will execute four times
        while (repeat < 4) {
            System.out.print("*/@&@\\*");

            // Updates the condition
            repeat++;
        }

        // Prints the string "2021" and starts a new line
        System.out.print("2021\n");

        // Prints a line of hyphens between sections
        sectionDivider();

        // Prints a description for Section B
        sectionBHeader();

        // Declares a variable to standard input
        Scanner keyboard = new Scanner(System.in);

        // Declare and initialize the variables that store the amount of positive and
        // negative integers input.
        int positiveNumber = 0;
        int negativeNumber = 0;

        // Asks the user to input an integer
        System.out.print("Enter an integer, 0 to terminate: ");
        int input = keyboard.nextInt();

        // Increment the positive variable or negative variable respectfully to the users entry
        if (input > 0)
            positiveNumber++;
        else if (input < 0)
            negativeNumber++;

        // repeats the previous steps of asking for an integer and incrementing the respectful variable
        // if the user did not input the value zero, until the user input the value zero
        while (input != 0) {
            // Asks the user to input an integer
            System.out.print("Enter an integer, 0 to terminate: ");
            input = keyboard.nextInt();

            if (input > 0)
                positiveNumber++;
            else if (input < 0)
                negativeNumber++;
        }

        // Prints the amount of times the user input a positive or negative integer
        System.out.println("Positive numbers entered: " + positiveNumber);
        System.out.println("Negative numbers entered: " + negativeNumber);

        // Prints a line of hyphens between sections
        sectionDivider();

        // Prints a description for Section C
        sectionCHeader();

        // Declare an initialize the condition variable
        int factorNineNumber = 9;

        // Prints the condition variable when it is a factor of nine between nine and sixty-three
        // The condition is incremented by one after a successful loop execution.
        while (factorNineNumber <= 63) {
            if (factorNineNumber % 9 == 0)
                System.out.print(factorNineNumber + "\t");
            factorNineNumber++;
        }
        
        System.out.println();
        
        // Prints the condition variable when it is a factor of nine between sixty-three and nine
        // The condition is decremented by one after a successful loop execution.
        while (factorNineNumber >= 9) {
            if (factorNineNumber % 9 == 0)
                System.out.print(factorNineNumber + "\t");
            factorNineNumber--;
        }
        
        System.out.println();

        keyboard.close();
    }

    // Prints a description for section A
    public static void sectionAHeader() {
        System.out.println("          ------ Section A ------");
        System.out.println("(while) Loop runs and places 4 */@&@\\* symbol patterns");
        System.out.println("        between \"October\" and \"2021\".");
        System.out.println("========================================================================");
    }

    // Prints a description for section B
    public static void sectionBHeader() {
        System.out.println("          ------ Section B ------");
        System.out.println("(while) loop asks for integers until you enter 0.");
        System.out.println("The loop will count the number of positive and negative integers entered.");
        System.out.println("Both counts will be printed after the loop finishes.");
        System.out.println("========================================================================");
    }

    // Prints a description for section C
    public static void sectionCHeader() {
        System.out.println("          ------ Section C ------");
        System.out.println("(while) loop prints 9 through 63, then 63 down to 9, by nines.");
        System.out.println("Each set of numbers appears on its own line, tab distance apart.");
        System.out.println("========================================================================");
    }

    // Prints a line of hyphens between sections
    public static void sectionDivider() {
        System.out.println();
        System.out.println("------------------------------------------------------------------------");
        System.out.println();
    }
}
