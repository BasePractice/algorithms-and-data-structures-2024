package ru.mirea.practice.s0000001.num3;

public final class Main {
    private Main() {
    }

    private static class HashTable {
        private static class Node {
            double key;
            String value;
            Node next;

            Node(double k, String v) {
                key = k;
                value = v;
                next = null;
            }
        }

        private Node[] table;
        private int size;

        public HashTable(int size) {
            this.size = size;
            table = new Node[size];
        }

        private int hash(double key) {
            long bits = Double.doubleToLongBits(key);
            return (int)(bits ^ (bits >>> 32)) % size;
        }

        public void put(double key, String value) {
            int index = hash(key);
            Node newNode = new Node(key, value);
            if (table[index] == null) {
                table[index] = newNode;
            } else {
                Node current = table[index];
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }

        public String get(double key) {
            int index = hash(key);
            Node current = table[index];
            while (current != null) {
                if (current.key == key) {
                    return current.value;
                }
                current = current.next;
            }
            return null;
        }
    }

    public static void main(String[] args) {
        HashTable ht = new HashTable(10);
        ht.put(3.14, "Pi");
        ht.put(2.71, "e");
        ht.put(1.62, "Golden Ratio");

        System.out.println("Значение для 3.14: " + ht.get(3.14));
        System.out.println("Значение для 2.71: " + ht.get(2.71));
        System.out.println("Значение для 1.62: " + ht.get(1.62));
    }
}
