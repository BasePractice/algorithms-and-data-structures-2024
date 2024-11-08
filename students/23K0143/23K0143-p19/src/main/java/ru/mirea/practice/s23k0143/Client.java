package ru.mirea.practice.s23k0143;

class Client {
    private String fullName;
    private String inn;

    public Client(String fullName, String inn) throws InvalidInnException {
        this.fullName = fullName;
        setInn(inn);
    }

    public void setInn(String inn) throws InvalidInnException {
        if (inn.length() != 10 && inn.length() != 12) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }
        this.inn = inn;
    }

    public String getFullName() {
        return fullName;
    }

    public String getInn() {
        return inn;
    }
}

