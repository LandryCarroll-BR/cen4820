package org.landrycarroll;

public class Main {
    static void main() {
        int index = 10;
        int output = getFibonacciNumber(index);
        System.out.println("The Fibonacci number with an index of " + index + " is " + output);
    }

    static public int getFibonacciNumber(int index) {
        if (index < 0) {
            throw new IllegalArgumentException("index must be < 0");
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
