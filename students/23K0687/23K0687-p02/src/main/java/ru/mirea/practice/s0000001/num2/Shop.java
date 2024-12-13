package ru.mirea.practice.s0000001.num2;

public class Shop {
    Computer[] c;
    int n;

    public Shop(int size) {
        c = new Computer[size];
        n = 0;
    }

    public void add(Computer comp) {
        if (n < c.length) {
            c[n++] = comp;
        }
    }

    public void remove(String name) {
        for (int i = 0; i < n; i++) {
            if (c[i].name.equals(name)) {
                for (int j = i; j < n - 1; j++) {
                    c[j] = c[j + 1];
                }
                n--;
                return;
            }
        }
    }

    public String find(String name) {
        for (int i = 0; i < n; i++) {
            if (c[i].name.equals(name)) {
                return c[i].toString();
            }
        }
        return "Not found";
    }
}
