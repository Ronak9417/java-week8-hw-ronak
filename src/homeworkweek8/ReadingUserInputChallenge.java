package homeworkweek8;

import java.util.Scanner;

/**
 * Read 10 numbers from the console entered by the user and print the sum of those
 * numbers.
 * -Use the hasNextInt() method from the scanner to check if the user has entered an int value.
 * -If hasNextInt() returns false, print the message Invalid Number. Continue reading until you have read
 * 10 numbers.
 * -Use the nextInt() method to get the number and add it to the sum.
 * -Before the user enters each number, print the message Enter number #x: where x represents the
 * count, i.e. 1, 2, 3, 4, etc.
 * For example, the first message printed to the user would be entered number #1:, the next Enter number
 * #2:, and so on.
 * Hint:
 * -Use a while loop.
 * -Use a counter variable for counting valid numbers.
 * -Close the scanner after you don't need it anymore.
 * -Create a class with the name ReadingUserInputChallenge.
 */


public class ReadingUserInputChallenge {

    // Main method
    public static void main(String[] args) {
        input(); // calling instance method into the main method
    }
    // instance method
    public static void input() {
        int sum = 0;
        int counter = 1;

        // scanner declaration
        Scanner scr = new Scanner(System.in);
        // loop condition
        while (counter <= 10) {
            System.out.print("Enter number #" + counter + " : ");
            boolean validNumber = scr.hasNextInt();

            if (validNumber) {
                int number = scr.nextInt();
                sum += number;
                counter++;
            } else {
                //returns false, print the message Invalid Number
                System.out.println("Invalid number");

            }
            scr.nextLine();
        }
        System.out.print("Sum of all numbers= " + sum);
        // close scanner
        scr.close();
    }

}
