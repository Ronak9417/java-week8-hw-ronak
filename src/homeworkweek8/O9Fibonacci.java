package homeworkweek8;

/**
 * . Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
 */
public class O9Fibonacci {
    // Main method
    public static void main(String[] args) {
        //Declare local variable
        int n = 100, firstTerm = 0, secondTerm = 1;
        // Print statement
        System.out.println("Fibonacci Series Up To " + n + " : ");
        //while condition
        while (firstTerm <= n) {
            System.out.print(firstTerm + ", ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;

        }
    }

}
