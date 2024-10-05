package ru.mirea.practice.s23L0908.task11;

public abstract class Converting {
    public static void main(String[] args) {
        FarengTemp a = new FarengTemp(87);
        CelciusTemp b = new CelciusTemp(12);

        System.out.println(a.convert());
        System.out.println(b.convert());
    }
}
