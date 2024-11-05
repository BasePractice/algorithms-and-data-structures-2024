package ru.mirea.practice.s0000001.prog1;

public class Client {
    private String name;
    private String inn;

    public Client(String name, String inn) {
        this.name = name;
        this.inn = inn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInn() {
        return inn;
    }

    public void setInn(String inn) {
        this.inn = inn;
    }

    public void validateInn() throws InvalidinnException {
        if (inn.length() != 12 || !inn.matches("\\d+")) {
            throw new InvalidinnException("Недействительный ИНН " + inn);
        }
        System.out.println("Инн клиента: " + inn);
    }
}
