package home.root.search;

/**
 * Same as quick-union, but maintain extra array sz[i]
 * to count number of objects in the tree rooted at i.
 * ---------------------------------------------------------
 * |    algorithm           |  initialize  |   union   |   find   |
 * |    path-compression    |              |           |          |
 * |    weighted QU         |  N           |   lg(N)   |   lg(N)  |
 * ---------------------------------------------------------
 * As we can see in fact it is not so mach better way for solving the problem.
 */
public class PathCompressionWeightedQuickUnionUF implements UF {

    private final int[] id;
    // count number of objects in the tree rooted at i.
    private final int[] sz;

    /**
     * set id of each object to itself
     * (N array accesses)
     * create and init the sz array as well.
     */
    public PathCompressionWeightedQuickUnionUF(int n) {
        this.id = new int[n];
        this.sz = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
            sz[i] = i;
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
     * Modify:
     * Link root of smaller tree to root of larger tree.
     * Update the sz[] array.
     */
    @Override
    public void union(int x, int y) {
        int rootX = getRoot(x);
        int rootY = getRoot(y);
        if (rootX == rootY) {
            return;
        }
        if (sz[rootX] < sz[rootY]) {
            id[rootX] = rootY;
            sz[rootY] += sz[rootX];
        } else {
            id[rootY] = rootX;
            sz[rootX] += sz[rootY];
        }
        id[rootX] = rootY;
    }

    /**
     * chase parent pointers until reach root
     * (depth of i array accesses)
     */
    private int getRoot(int element) {
        while (element != id[element]) {
            id[element] = id[id[element]];
            element = id[element];
        }
        return element;
    }
}