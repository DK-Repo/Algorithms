package home.root.search;

import org.junit.Assert;
import org.junit.Test;

public class UFTest {

    @Test
    public void quickFindUF() {
        int n = 10;
        UF uf = new QuickFindUF(n);

        boolean isConnected = uf.connected(1, 2);
        Assert.assertFalse(isConnected);

        uf.union(1, 2);
        isConnected = uf.connected(1, 2);
        Assert.assertTrue(isConnected);
    }

    @Test
    public void quickUnionUF() {
        int n = 10;
        UF uf = new QuickUnionUF(n);

        boolean isConnected = uf.connected(1, 2);
        Assert.assertFalse(isConnected);

        uf.union(1, 2);
        isConnected = uf.connected(1, 2);
        Assert.assertTrue(isConnected);
    }

    @Test
    public void weightedQuickUnionUF() {
        int n = 10;
        UF uf = new WeightedQuickUnionUF(n);

        boolean isConnected = uf.connected(1, 2);
        Assert.assertFalse(isConnected);

        uf.union(1, 2);
        isConnected = uf.connected(1, 2);
        Assert.assertTrue(isConnected);
    }

    @Test
    public void pathCompressionWeightedQuickUnionUF() {
        int n = 10;
        UF uf = new PathCompressionWeightedQuickUnionUF(n);

        boolean isConnected = uf.connected(1, 2);
        Assert.assertFalse(isConnected);

        uf.union(1, 2);
        isConnected = uf.connected(1, 2);
        Assert.assertTrue(isConnected);
    }
}