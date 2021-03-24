package home.root.search;

/**
 * This is an example of really quick union but slow find algorithm
 * ---------------------------------------------------------
 * |    algorithm    |  initialize  |   union   |   find   |
 * |    quick-union  |  N           |   N       |   N      |
 * ---------------------------------------------------------
 * As we can see in fact it is not so mach better way for solving the problem.
 */
public class QuickUnionUF implements UF {

    private final int[] id;

    /**
     * set id of each object to itself
     * (N array accesses)
     */
    public QuickUnionUF(int n) {
        this.id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    /**
     * check if p and q have same root
     * (depth of p and q array accesses)
     */
    @Override
    public boolean connected(int x, int y) {
        return getRoot(x) == getRoot(y);
    }

    /**
     * change root of p to point to root of q
     * (depth of p and q array accesses)
     */
    @Override
    public void union(int x, int y) {
        final int rootX = getRoot(x);
        final int rootY = getRoot(y);
        id[rootX] = rootY;
    }

    /**
     * chase parent pointers until reach root
     * (depth of i array accesses)
     */
    private int getRoot(int element) {
        while (element != id[element]) {
            element = id[element];
        }
        return element;
    }
}