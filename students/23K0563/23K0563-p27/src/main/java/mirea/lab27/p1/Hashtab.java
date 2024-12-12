package mirea.lab27.p1;

import java.util.LinkedList;

public class Hashtab {
    private LinkedList<Element>[] ht;
    private int size;

    public Hashtab(int size) {
        this.size = size;
        ht = new LinkedList[size];
        for (int i = 0; i < size; i++) {
            ht[i] = new LinkedList<>();
        }
    }

    private int hashtabHash(String key) {
        return Math.abs(key.hashCode() % size);
    }

    public void hashtabAdd(String key, String content) {
        LinkedList<Element> list = ht[hashtabHash(key)];
        for (Element x : list) {
            if (x.key == key) {
                x.content = content;
            }
        }
        ht[hashtabHash(key)].add(new Element(key,content));
    }

    public String hashtabLookup(String key) {
        LinkedList<Element> list = ht[hashtabHash(key)];
        for (Element x : list) {
            if (x.key.equals(key)) {
                return x.content;
            }
        }
        return null;
    }

    public void hashtabDelete(String key) {
        ht[hashtabHash(key)].removeIf(ht -> ht.key == key);
    }

    private class Element {
        String key;
        String content;

        Element(String key, String content) {
            this.key = key;
            this.content = content;
        }
    }

}
