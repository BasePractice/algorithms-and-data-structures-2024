package ru.mirea.practice.s23L0908.task1;

class UserInterface implements Observer {
    public void update(String state) {
        System.out.println("Updated string: " + state);
    }
}
