package ru.mirea.practice.s23k0368.prog2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Магический стул превратился в магический шар!");
    }

    @Override
    public void sit() {
        System.out.println("Мы на него сели.");
    }
}
