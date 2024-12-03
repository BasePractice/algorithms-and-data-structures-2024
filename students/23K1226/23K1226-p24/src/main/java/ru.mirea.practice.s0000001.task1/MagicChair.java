package ru.mirea.practice.s0000001.task1;

class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Происходит магия!");
    }

    @Override
    public void sit() {
        System.out.println("Сидим на магическом стуле");
    }
}
