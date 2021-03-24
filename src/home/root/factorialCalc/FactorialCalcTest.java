package home.root.factorialCalc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * This is the simple test for FactorialCalc
 * long factorial = 1 * 2 * 3 * 4 * ... * N
 */
public class FactorialCalcTest {

    private static final FactorialCalc MOCK = new FactorialCalc();

    @Test
    public void calcRecursive() {
        long factorial = MOCK.calcRecursive(3);
        long factorial2 = MOCK.calcRecursive(7);
        long factorial3 = MOCK.calcRecursive(0);

        assertEquals(6, factorial);
        assertEquals(5040, factorial2);
        assertEquals(1, factorial3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void calcRecursive_WhenNegativeValue() {
        long factorial = MOCK.calcRecursive(-4); //unknown
        // Then exception:
    }

    @Test
    public void calcIterative() {
        long factorial = MOCK.calcIterative(3);
        long factorial2 = MOCK.calcIterative(7);
        long factorial3 = MOCK.calcIterative(0);

        assertEquals(6, factorial);
        assertEquals(5040, factorial2);
        assertEquals(1, factorial3);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void calcIterative_WhenNegativeValue() {
        long factorial = MOCK.calcRecursive(Integer.MIN_VALUE); //unknown
        // Then exception:
    }
}
