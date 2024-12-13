package ru.mirea.practice.s00000027.task1;

public class HashTab {

    private static final int SIZE = 10;
    private Node[] table;


    private static class Node {
        String key;
        String value;
        Node next;

        Node(String key, String value) {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private int hashtabHash(String key) {
        return key.hashCode() % SIZE;
    }

    public void hashtabInit() {
        table = new Node[SIZE];
    }

    public void hashtabAdd(String key, String value) {
        int index = hashtabHash(key);
        Node newNode = new Node(key, value);

        if (table[index] == null) {
            table[index] = newNode;
        } else {
            Node current = table[index];
            while (current.next != null) {
                if (current.key.equals(key)) {
                    current.value = value;
                    return;
                }
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public String hashtabLookup(String key) {
        int index = hashtabHash(key);
        Node current = table[index];
        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void hashtabDelete(String key) {
        int index = hashtabHash(key);
        Node current = table[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    table[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public static void main(String[] args) {
        HashTab hashTab = new HashTab();
        hashTab.hashtabInit();

        hashTab.hashtabAdd("key1", "value1");
        hashTab.hashtabAdd("key2", "value2");
        hashTab.hashtabAdd("key3", "value3");

        System.out.println(hashTab.hashtabLookup("key1"));
        System.out.println(hashTab.hashtabLookup("key2"));
        System.out.println(hashTab.hashtabLookup("key4"));

        hashTab.hashtabDelete("key2");

        System.out.println(hashTab.hashtabLookup("key2"));
    }
}
