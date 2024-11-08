package ru.mirea.practice.s23k0145.num4;

public final class Dem {

    private Dem() {

    }

    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Details for key: " + key);
    }

    public static void main(String[] args) {
        Dem demo = new Dem();
        demo.getDetails(null);
    }
}