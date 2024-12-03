package ru.mirea.practice.s0000001.task6;

public abstract class ThrowsDemo {
    public static void printMessage(String key) {
        String message = getDetails(key);
        System.out.println(message);
    }

    public static String getDetails(String key) {
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            return "data for " + key;
        } catch (NullPointerException er) {
            return "data for null";
        }
    }

    public static void main(String[] args) {
        printMessage("0");
        printMessage(null);
    }
}
