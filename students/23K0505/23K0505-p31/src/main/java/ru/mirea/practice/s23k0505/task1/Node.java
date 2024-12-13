package ru.mirea.practice.s23k0505.task1;

public class Node {
    int numberOfKeys;   // количество занятых ключей
    int[] key = new int[3];
    Node first;
    Node second;
    Node third;
    Node fourth;
    Node parents;   // указатель на родителей

    boolean find(int k) {   // ключ находится в вершине или нет
        for (int i = 0; i < numberOfKeys; i++) {
            if (key[i] == k) {
                return true;
            }
        }
        return false;
    }

    void swap(int x, int y) {
        int tempInt = x;
        x = y;
        y = tempInt;
    }

    void sort2(int x, int y) {
        if (x > y) {
            swap(x, y);
        }
    }

    void sort3(int x, int y, int z) {
        if (x > y) {
            swap(x, y);
        }

        if (x > z) {
            swap(x, y);
        }

        if (y > z) {
            swap(y, z);
        }
    }

    void sort() {
        if (numberOfKeys == 2) {
            sort2(key[0], key[1]);
        } else if (numberOfKeys == 3) {
            sort3(key[0], key[1], key[2]);
        }
    }

    void addKeyInNode(int k) {
        key[numberOfKeys] = k;
        numberOfKeys++;
        sort();
    }

    void deleteKeyFromNode(int k) {
        if (numberOfKeys >= 1 && key[0] == k) {
            key[0] = key[1];
            key[1] = key[2];
            numberOfKeys--;
        } else if (numberOfKeys == 2 && key[1] == k) {
            key[1] = key[2];
            numberOfKeys--;
        }
    }

    void becomeNode2(int k, Node first, Node second) {
        key[0] = k;
        this.first = first;
        this.second = second;
        this.third = null;
        this.fourth = null;
        this.parents = null;
        numberOfKeys = 1;
    }

    boolean isLeaf() {
        return first == null && second == null && third == null;
    }

    public Node(int key) {
        numberOfKeys = 1;
        this.key[0] = key;
        first = null;
        second = null;
        third = null;
        fourth = null;
        parents = null;
    }

    public Node(int key, Node first, Node second, Node third, Node fourth, Node parents) {
        numberOfKeys = 1;
        this.key[0] = key;
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
        this.parents = parents;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < numberOfKeys; i++) {
            sb.append(key[i]);
            if (i < numberOfKeys - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
