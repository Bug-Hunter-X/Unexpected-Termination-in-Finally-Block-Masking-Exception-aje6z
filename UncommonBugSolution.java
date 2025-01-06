public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        boolean errorOccurred = false;
        try {
            int z = x / y; // Potential ArithmeticException
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
            errorOccurred = true;
        } finally {
            System.out.println("This will always execute.");
        }
        if (!errorOccurred) {
            System.out.println("This line will execute if no error occurred.");
        } else {
            System.out.println("Error occurred, exiting.");
        }
    }
}