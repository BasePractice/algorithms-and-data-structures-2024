package ru.mirea.practice.s23k1158.t1.t4;

public final class Demo {

    private Demo() {

    }

    public void getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        System.out.println("Details for key: " + key);
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.getDetails(null);
    }
}