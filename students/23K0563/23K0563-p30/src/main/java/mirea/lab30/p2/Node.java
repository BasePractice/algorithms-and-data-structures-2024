package mirea.lab30.p2;

public class Node implements Comparable<Node> {
    char c;
    int prob;
    Node left = null;
    Node right = null;

    public Node(char c, int prob) {
        this.c = c;
        this.prob = prob;
    }

    @Override
    public int compareTo(Node o) {
        return this.prob - o.prob;
    }

}
