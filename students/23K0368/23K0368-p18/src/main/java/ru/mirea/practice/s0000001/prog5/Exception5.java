package ru.mirea.practice.s0000001.prog5;

public abstract class Exception5 {
    public static String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        try {
            System.out.println(getDetails(null));// Вызов метода с параметром null
            System.out.println(getDetails("1"));// Вызов метода с параметром 1
        } catch (NullPointerException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}
