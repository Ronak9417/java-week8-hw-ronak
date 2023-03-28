package homeworkweek8;

/**
 * Display right angle triangle of @ using nested for loops
 *
 * @
 * @@
 * @@@
 * @@@@
 * @@@@@
 */
public class O8RightAngleTriangle {
    // main method
    public static void main(String[] args) {
        //loop condition
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                //Print @
                System.out.print("@");
            }
            // Print space
            System.out.println("");
        }

    }
}
