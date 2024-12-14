package ru.mirea.practice.s0000001;

public class MagicChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Вы сидите на магическом стуле.");
    }

    public void doMagic() {
        System.out.println("Магический стул выполняет магию.");
    }
}
