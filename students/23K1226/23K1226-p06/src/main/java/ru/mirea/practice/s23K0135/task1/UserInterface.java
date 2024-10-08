package ru.mirea.practice.s23K0135.task1;

class UserInterface implements Observer {
    public void update(String state) {
        System.out.println("Updated string: " + state);
    }
}
