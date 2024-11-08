package ru.mirea.practice.s23k0120.task6;

public class ThrowsDemo {
    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.printMessage("a"); // data for a
        demo.printMessage(null); // null key in getDetails
    }

    public void printMessage(String key) {
        String message;
        try {
            message = getDetails(key);
        } catch (NullPointerException e) {
            message = "null key in getDetails";
        }
        System.out.println(message);
    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
}
