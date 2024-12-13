package mirea.lab27.p2;

import mirea.lab27.p1.Hashtab;

public abstract class Prac27p2 {
    public static void main(String[] args) {
        int size = 5;
        Hashtab h = new Hashtab(size);
        h.hashtabAdd("first", "element1");
        h.hashtabAdd("second", "element2");
        h.hashtabAdd("third", "element3");
        h.hashtabAdd("fourth", "element4");
        h.hashtabAdd("fifth", "element5");

        System.out.println(h.hashtabLookup("first"));
        System.out.println(h.hashtabLookup("fourth"));

        h.hashtabDelete("second");
        System.out.println(h.hashtabLookup("second") == null);

    }
}
