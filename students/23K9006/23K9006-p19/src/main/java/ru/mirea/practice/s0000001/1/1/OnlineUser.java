package ru.mirea.practice.s0000001;

public class OnlineUser extends User {

    public OnlineUser(String name, String taxId) {
        super(name, taxId);
    }

    @Override
    public void checkTaxId() throws InvalidTaxIdException {
        if (taxId == null || !taxId.matches("\\d{10}") && !taxId.matches("\\d{12}")) {
            throw new InvalidTaxIdException("Недействительный ИНН: " + taxId);
        }
    }
}
