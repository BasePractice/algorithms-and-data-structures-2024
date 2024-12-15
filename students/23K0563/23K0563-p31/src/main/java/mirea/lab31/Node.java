package mirea.lab31;

import java.util.ArrayList;
import java.util.List;

public class Node {
    boolean leaf;
    List<Integer> key = new ArrayList<>();
    List<Node> child = new ArrayList<>();

    public Node(boolean leaf) {
        this.leaf = leaf;
    }
}
