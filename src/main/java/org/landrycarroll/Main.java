package org.landrycarroll;

/**
 * Application entry point and utility methods for computing Fibonacci numbers.
 *
 * <p>This class demonstrates a simple recursive implementation of the Fibonacci sequence,
 * where:
 * <ul>
 *   <li>F(0) = 0</li>
 *   <li>F(1) = 1</li>
 *   <li>F(n) = F(n-1) + F(n-2) for n &gt; 1</li>
 * </ul>
 *
 * <p><strong>Note:</strong> This implementation is intentionally recursive for clarity, but it is
 * not efficient for larger indices due to repeated recomputation.
 */
public class Main {

    /**
     * Runs a basic demonstration by computing and printing the Fibonacci number
     * for a fixed index value.
     *
     * <p>Example output:
     * <pre>
     * The Fibonacci number with an index of 10 is 55
     * </pre>
     */
    static void main() {
        int index = 10;
        int output = getFibonacciNumber(index);
        System.out.println("The Fibonacci number with an index of " + index + " is " + output);
    }

    /**
     * Computes the Fibonacci number at the provided index using recursion.
     *
     * <p>The Fibonacci sequence is defined as:
     * <ul>
     *   <li>F(0) = 0</li>
     *   <li>F(1) = 1</li>
     *   <li>F(n) = F(n-1) + F(n-2) for n &gt; 1</li>
     * </ul>
     *
     * @param index the position in the Fibonacci sequence (must be non-negative)
     * @return the Fibonacci number at the given index
     * @throws IllegalArgumentException if {@code index} is negative
     */
    public static int getFibonacciNumber(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("index must be >= 0");
        }

        if (index == 0) {
            return 0;
        }

        if (index == 1) {
            return 1;
        }

        return getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
    }
}
