package home.root.fibonacci;

/**
 * Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number.
 * We prepare for cross questions like using iteration over recursion and how
 * to optimize the solution using caching and memoization.
 */
public class FibonacciCalc {

    public String calcFiboIterative(int number) {
        if (number < 1) return "";

        StringBuilder out = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            out.append(calcOneFiboIterative(i));

            if (i != number) {
                out.append(", ");
            }
        }
        return out.toString();
    }

    public String calcFiboRecursive(int number) {
        if (number < 1) return "";

        StringBuilder out = new StringBuilder();
        for (int i = 1; i <= number; i++) {
            out.append(calcOneFiboRecursive(i));

            if (i != number) {
                out.append(", ");
            }
        }
        return out.toString();
    }

    // f(n) = f(n - 1) + f(n - 2)
    private long calcOneFiboRecursive(int number) {
        if (number == 1 || number == 2) return 1;
        return calcOneFiboRecursive(number - 1) + calcOneFiboRecursive(number - 2);
    }

    // f(n) = f(n - 1) + f(n - 2)
    private long calcOneFiboIterative(int number) {
        if (number == 1 || number == 2) return 1;

        long numberMinus1 = 1L;
        long numberMinus2 = 1L;
        long fiboResult = 1L;

        for (int i = 3; i <= number; i++) {
            fiboResult = numberMinus1 + numberMinus2;
            numberMinus1 = numberMinus2;
            numberMinus2 = fiboResult;
        }
        return fiboResult;
    }
}
