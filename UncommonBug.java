public class UncommonBug {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int z = x / y; // Potential ArithmeticException
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("This will always execute."); // This line might be unexpectedly missed
            if (y == 0) {
                System.exit(1); // Unexpected termination due to System.exit()
            }
        }
        System.out.println("This line might not execute.");
    }
}