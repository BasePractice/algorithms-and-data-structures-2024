package ru.mirea.practice.s0000001.task2;

public class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("The magic chair is performing a magic trick!");
    }

    @Override
    public void sit() {
        System.out.println("Sitting on a magic chair.");
    }
}

