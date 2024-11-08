package ru.mirea.practice.s0000001.task5;

public abstract class ThrowsDemo {
    public static void getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
        } catch (NullPointerException e) {
            System.out.println("Erorr: NullPointerException");
        }
    }

    public static void main(String[] args) {
        getDetails(null);
    }
}
