package ru.mirea.practice.s0000001;

class InternationalPhoneNumber extends PhoneNumber {
    public InternationalPhoneNumber(String rawNumber) {
        super(rawNumber);
    }

    @Override
    public String formatNumber() {
        String digits = rawNumber.replaceAll("[^0-9]", "");

        if (digits.length() < 11) {
            throw new IllegalArgumentException("Неверный номер телефона.");
        }

        String countryCode = digits.substring(0, digits.length() - 10);
        String areaCode = digits.substring(digits.length() - 10, digits.length() - 7);
        String centralOfficeCode = digits.substring(digits.length() - 7, digits.length() - 4);
        String lineNumber = digits.substring(digits.length() - 4);

        return "+" + countryCode + areaCode + "–" + centralOfficeCode + "–" + lineNumber;
    }
}
