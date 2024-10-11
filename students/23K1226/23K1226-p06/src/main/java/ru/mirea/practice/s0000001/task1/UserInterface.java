package ru.mirea.practice.s0000001.task1;

class UserInterface implements Observer {
    public void update(String state) {
        System.out.println("Updated string: " + state);
    }
}
