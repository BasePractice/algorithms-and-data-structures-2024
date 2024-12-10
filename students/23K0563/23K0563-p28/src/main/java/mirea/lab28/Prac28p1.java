package mirea.lab28;

import java.util.HashSet;
import java.util.TreeSet;

public abstract class Prac28p1 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("element1");
        hs.add("element2");
        hs.add("element3");
        System.out.println(hs);

        TreeSet<String> ts = new TreeSet<>(hs);
        System.out.println(ts);
    }
}
