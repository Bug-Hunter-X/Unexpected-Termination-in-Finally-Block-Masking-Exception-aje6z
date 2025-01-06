# Uncommon Java Bug: Unexpected Termination in Finally Block

This repository demonstrates a subtle bug in Java involving the interaction of exception handling (try-catch-finally), and the use of `System.exit()` within a `finally` block.  The bug showcases how `System.exit()` can mask expected behavior and lead to unexpected program termination. The solution provides an improved approach. 

## Bug Description
The main program attempts a division by zero causing an `ArithmeticException`, which is successfully caught. However, the `finally` block contains `System.exit(1)`, which terminates the program before the code after the `finally` block can execute. This behavior is not immediately obvious to developers unfamiliar with the immediate termination nature of `System.exit()`.

## How to Reproduce
1. Compile the `UncommonBug.java` file.
2. Run the compiled program.
3. Observe that the last print statement ("This line might not execute.") is not printed, and the program exits with code 1. This could be misleading when debugging, especially if you're checking for output in your logs.

## Solution
The solution demonstrates a more robust approach to program termination, avoiding `System.exit()` in the `finally` block unless absolutely necessary and handling the error scenario differently in order to avoid confusing outputs.