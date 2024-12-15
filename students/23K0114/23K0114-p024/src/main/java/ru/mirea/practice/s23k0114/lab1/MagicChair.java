package ru.mirea.practice.s23k0114.lab1;


class MagicChair implements Chair {
    public void doMagic() {
        System.out.println("Происходит магия!");
    }

    @Override
    public void sit() {
        System.out.println("Сидим на магическом стуле");
    }
}
