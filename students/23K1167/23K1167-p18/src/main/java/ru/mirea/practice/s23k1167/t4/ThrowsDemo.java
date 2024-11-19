package ru.mirea.practice.s23k1167.t4;

public final class ThrowsDemo {

    private ThrowsDemo() {

    }

    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Details for key: " + key);
    }

    public static void main(String[] args) {
        ThrowsDemo demo = new ThrowsDemo();
        demo.getDetails(null);
    }
}
