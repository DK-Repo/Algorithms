package home.root.search;

public interface UF {

    boolean connected(int x, int y);

    void union(int x, int y);
}
