package home.root.primeNumbers;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {

    private static final PrimeNumber MOCK = new PrimeNumber();

    @Test
    public void isPrime() {
        Assert.assertTrue(MOCK.isPrime(3));
        Assert.assertTrue(MOCK.isPrime(7));
        Assert.assertTrue(MOCK.isPrime(17));

        Assert.assertFalse(MOCK.isPrime(1152835127));
        Assert.assertFalse(MOCK.isPrime(-1823641));
    }
}
