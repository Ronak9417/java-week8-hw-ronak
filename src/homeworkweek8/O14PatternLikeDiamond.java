package homeworkweek8;

/**
 * 14. Write a program in Java to display the pattern like a diamond.
 * While loop
 */
public class O14PatternLikeDiamond {

    // Main method
    public static void main(String[] args) {
        // Declaring  variables
        int number = 7;
        // Diamond starting with single star in first row
        int m = 1;
        int n;
        // Outer loop
        while (m <= number) {
            n = 1;
            // Inner loop 1
            while (n++ <= number - m) {
                // Print spaces
                System.out.print(" ");
            }
            n = 1;
            // Inner loop 2
            while (n++ <= m * 2 - 1) {

                // Print star
                System.out.print("*");
            }

            System.out.println();
            m++;
        }
        m = number - 1;
        // Outer loop 2
        while (m > 0) {
            n = 1;

            // Inner loop 1
            while (n++ <= number - m) {

                // Print spaces
                System.out.print(" ");
            }
            n = 1;
            // Inner loop 2

            while (n++ <= m * 2 - 1) {

                // Print star
                System.out.print("*");
            }

            System.out.println();

            m--;
        }
    }
}




