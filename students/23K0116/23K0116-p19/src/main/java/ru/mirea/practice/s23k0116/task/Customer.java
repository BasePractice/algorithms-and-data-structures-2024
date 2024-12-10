package ru.mirea.practice.s23k0116.task;

class Customer {
    private final String fullName;
    private final String inn;

    public Customer(String fullName, String inn) {
        this.fullName = fullName;
        this.inn = inn;
    }

    public String getFullName() {
        return fullName;
    }

    public String getInn() {
        return inn;
    }

    // Проверка ИНН на корректность
    public void validateInn() throws InvalidinnException {
        if (inn.length() != 10 || !inn.matches("\\d+")) {
            throw new InvalidinnException("Недействительный ИНН: " + inn);
        }
    }
}
