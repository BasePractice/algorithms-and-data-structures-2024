package ru.mirea.practice.s23k0350;

class Client {
    private String fullName;
    private String inn;

    public Client(String fullName, String inn) throws InvalidException {
        this.fullName = fullName;
        setInn(inn);
    }

    public void setInn(String inn) throws InvalidException {
        if (!isValidInn(inn)) {
            throw new InvalidException("Недействительный ИНН: " + inn);
        }
        this.inn = inn;
    }

    private boolean isValidInn(String inn) {
        return inn.matches("\\d{10}");
    }

    @Override
    public String toString() {
        return "Клиент: " + fullName + ", ИНН: " + inn;
    }
}
