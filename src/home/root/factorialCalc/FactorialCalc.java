package home.root.factorialCalc;

public class FactorialCalc {

    // factorial = n * f(n-1) ..
    public long calcRecursive(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        if (number < 0) {
            throw new UnsupportedOperationException("Factorial can be calculated for positive values only.");
        }

        return number * calcRecursive(number - 1);
    }


    public long calcIterative(int number) {
        if (number == 0 || number == 1) {
            return 1;
        }
        if (number < 0) {
            throw new UnsupportedOperationException("Factorial can be calculated for positive values only.");
        }

        long factorial = 1L;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
