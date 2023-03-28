package homeworkweek8;

import java.util.Scanner;

/**
 * Write a program in Java to display the pattern like a triangle with a number.
 * For e.g.
 * Input number of rows: 10
 * Expected Output:
 * 1
 * 12
 * 123
 * 1234
 * 12345
 * 123456
 * 1234567
 * 12345678
 * 123456789
 * 12345678910
 */
public class O6TriangleWithNumber {
    // Main statement
    public static void main(String[] args) {
        //Declare local variable
        int i, j, n;
        // user input print statement
        System.out.print("Input number of row : ");
        //scanner declaration
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        //outer and inner for loop condition
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++)
                System.out.print(j);
            // Print space
            System.out.println("");

            //close scanner
            scan.close();
        }
    }

}
