package ru.mirea.practice.lab24.t2;

public class MagicalChair implements Chair {

    @Override
    public void sit() {
        System.out.println("Вы сидите на магическом стуле.");
    }

    public void doMagic() {
        System.out.println("Магия сработала!");
    }
}


