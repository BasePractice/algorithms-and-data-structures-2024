package ru.mirea.practice.s0000001.task2;

public class VagicChair implements Chair {
    public void doMagic() {
        System.exit(1);
    }

    @Override
    public void sitinOn() {
        System.out.println("u siting on MagicChair");
    }
}
