package home.root.search;

/**
 * This is an example of really quick find algorithm
 * ---------------------------------------------------------
 * |    algorithm    |  initialize  |   union   |   find   |
 * |    quick-find   |  N           |   N       |   1      |
 * ---------------------------------------------------------
 */
public class QuickFindUF implements UF {

    private final int[] id;

    public QuickFindUF(int n) {
        this.id = new int[n];
        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    @Override
    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    @Override
    public void union(int p, int q) {
        final int pid = id[p];
        final int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }
}
