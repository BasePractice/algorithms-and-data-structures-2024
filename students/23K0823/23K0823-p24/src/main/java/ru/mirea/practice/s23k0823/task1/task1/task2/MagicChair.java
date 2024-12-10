package ru.mirea.practice.s23k0823.task1.task1.task2;

public class MagicChair implements Chair {

    @Override
    public void sit() {
        System.out.println("Сижу на магическом стуле! ");
    }

    public void doMagic() {
        System.out.println("Магия!");
    }
}
