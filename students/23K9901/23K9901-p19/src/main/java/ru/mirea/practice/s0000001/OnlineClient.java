package ru.mirea.practice.s0000001;

public class OnlineClient extends Client {

    public OnlineClient(String fullName, String inn) {
        super(fullName, inn);
    }

    @Override
    public void validateInn() throws InvalidInnException {
        if (inn == null || !inn.matches("\\d{10}") && !inn.matches("\\d{12}")) {
            throw new InvalidInnException("Недействительный ИНН: " + inn);
        }
    }
}
