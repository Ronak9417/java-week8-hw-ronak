package homeworkweek8;

import java.util.Scanner;

/**
 * 10. Write a program to input any number and check if it Armstrong number or not
 * 153 = (1*1*1)+(5*5*5)+(3*3*3)
 * where:
 * (1*1*1)=1
 * (5*5*5)=125
 * (3*3*3)=27
 * So:
 * 1+125+27=153
 */
public class O10ArmstrongNumber {
    // Main statement
    public static void main(String[] args) {
        // Declare variable
        int n, count = 0, a, b, c, sum = 0;
        // Scanner declaration
        Scanner s = new Scanner(System.in);
        //Print statement
        System.out.print("Enter a number : ");
        n = s.nextInt();
        a = n;
        c = n;
        //loop condition
        while (a > 0) {
            a = a / 10;
            count++;
        }
        while (n > 0) {
            b = n % 10;
            sum = (int) (sum + Math.pow(b, count));
            n = n / 10;
        }
        if (sum == c) {
            //Print statement
            System.out.println(c + " is an Armstrong number");
        } else {
            //Print statement
            System.out.println(c + " is not an Armstrong number");
        }
    }
}
