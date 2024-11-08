package ru.mirea.practice.s0000001;

class RussianPhoneNumber1 extends PhoneNumber1 {
    public RussianPhoneNumber1(String rawNumber) {
        super(rawNumber);
    }

    @Override
    public String formatNumber() {
        String digits = rawNumber.replaceAll("[^0-9]", "");

        if (digits.length() != 11) {
            throw new IllegalArgumentException("Неверный номер телефона.");
        }

        String areaCode = digits.substring(1, 4);
        String centralOfficeCode = digits.substring(4, 7);
        String lineNumber = digits.substring(7, 11);

        return "+7" + areaCode + "–" + centralOfficeCode + "–" + lineNumber;
    }
}
