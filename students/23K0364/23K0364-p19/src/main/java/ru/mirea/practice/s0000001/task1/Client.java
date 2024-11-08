package ru.mirea.practice.s0000001.task1;

public class Client {
    private String fullName;
    private String inn;

    public Client(String fullName, String inn) {
        this.fullName = fullName;
        this.inn = inn;
    }

    public boolean isValidInn() throws InvalidInnException {
        if (inn.matches("\\d{10}(\\d{2})?")) {
            return true;
        } else {
            throw new InvalidInnException("ИНН недействителен");
        }
    }

    public void makeOrder() {
        try {
            if (isValidInn()) {
                System.out.println("Заказ для " + fullName + " с ИНН " + inn + " принят.");
            }
        } catch (InvalidInnException e) {
            System.out.println(e.getMessage());
        }
    }
}

