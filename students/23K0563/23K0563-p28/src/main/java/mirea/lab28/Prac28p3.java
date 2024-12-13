package mirea.lab28;

import java.util.Hashtable;

public abstract class Prac28p3 {
    public static void main(String[] args) {
        Hashtable<Double, String> ht = new Hashtable<>();
        ht.put(1.25, "element1");
        ht.put(0.1, "element2");
        ht.put(0.34, "element3");
        System.out.println(ht.get(0.1));
        System.out.println(ht);
    }
}
