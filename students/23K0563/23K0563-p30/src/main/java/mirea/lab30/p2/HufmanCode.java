package mirea.lab30.p2;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class HufmanCode {

    public void code(Node node, String code, Map<Character, String> map) {
        if (node != null) {
            if (node.c != '\0') {
                map.put(node.c, code);
            }
            code(node.left, code + "0", map);
            code(node.right, code + "1", map);
        }
    }

    public void tree(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char i : str.toCharArray()) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        PriorityQueue<Node> pr = new PriorityQueue<>();
        for (Map.Entry<Character, Integer> e : map.entrySet()) {
            Node n = new Node(e.getKey(), e.getValue());
            pr.add(n);
        }
        while (pr.size() > 1) {
            Node left = pr.poll();
            Node right = pr.poll();
            Node cur = new Node('\0', left.prob + right.prob);
            cur.left = left;
            cur.right = right;
            pr.add(cur);
        }
        Map<Character, String> codemap = new HashMap<>();
        code(pr.poll(), "", codemap);
        for (Map.Entry<Character, String> e : codemap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }
    }
}
