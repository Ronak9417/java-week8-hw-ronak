package homeworkweek8;

import java.util.Scanner;

/**
 * Write a Java program that takes the user to provide a single character from the
 * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
 * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
 * error message.
 * For eg:
 * Input an alphabet: p
 * Expected Output:
 * Input letter is Consonant
 */
public class O3VowelOfConsonant {

    //Declare main method
    public static void main(String[] args) {

        String ch;
        System.out.println("Enter any character : ");
        // Declare a scanner
        Scanner r = new Scanner(System.in);
        ch = r.next().toLowerCase();
        // vowel and consonant condition loop
        if (ch.equals("a") || ch.equals("e") || ch.equals("i") || ch.equals("o") || ch.equals("u")) {
            System.out.println(ch + " is a vowel");
        } else if (ch.length() > 1) {
            System.out.println("Error.Not a single character");
        } else {
// print statement
            System.out.println(ch + " is a consonant");
        }

    }
}
















