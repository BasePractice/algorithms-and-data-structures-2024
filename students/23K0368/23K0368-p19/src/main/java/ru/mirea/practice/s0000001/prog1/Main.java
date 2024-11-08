package ru.mirea.practice.s0000001.prog1;

public abstract class Main {

    public static void main(String[] args) {
        Client client1 = new Client("Иван", "111111111111");

        try {
            client1.validateInn();
        } catch (InvalidinnException e) {
            System.out.println(e.getMessage());
        }
    }
}
