package ru.mirea.practice.s29k0112.task2;

public class MagicChair implements Chair {

    void doMagic() {
        System.out.println("Это стул сделал магию!");
    }

    @Override
    public void sit() {
        System.out.println("Это магический стул");
    }

    @Override
    public void setChair(Chair chair) {
        System.out.println("Стул установлен");
    }
}
