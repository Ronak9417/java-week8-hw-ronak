package homeworkweek8;

import java.util.Scanner;

/**
 * 12. Write a programme to input any number and check if it is prime or not.
 * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
 * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
 * 17.... are the prime numbers.)
 */
public class O12PrimeOrNot {

    public static void main(String[] args) {
        // declare scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        //calling method
        isPrime(n);
        sc.close();
    }

    // static method with params
    //check if it is prime or not
    //Prime number is a number that is greater than 1 and divided by 1 or itself only
    public static void isPrime(int num) {
        boolean isPrime;
        if (num < 2)
            isPrime = false;
        else
            isPrime = true;

        for (int i = 2; i <= num / i; i++) {
            if ((num % i) == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime)
            // print statement
            System.out.println("The number is a prime number");
        else
            //print statement
            System.out.println("The number is not a prime number");
    }
}

