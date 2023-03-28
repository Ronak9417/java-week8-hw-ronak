package homeworkweek8;

import java.util.Scanner;

/**
 * -Read the numbers from the console entered by the user and print the minimum
 * and maximum number the user has entered.
 * -Before the user enters the number, print the message Enter number:
 * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
 * number.
 * Hint:
 * -Use an endless while loop.
 * -Create a class with the name MinAndMaxInputChallenge.
 */
public class MinAndMaxInputChallenge {
    //Declare main method
    public static void main(String[] args) {
//Declare a scanner
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numbers : ");
        //Declare variable
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        //min and max loop condition
        while (sc.hasNextInt()) {
            System.out.print("Enter numbers : ");
            int n = sc.nextInt();

            if (max < n)
                max = n;
            if (min > n)
                min = n;


        }
        // Print statement
        System.out.println("Max value is : " + max);
        System.out.println("Min value is : " + min);

    }


}








