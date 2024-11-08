package ru.mirea.practice.s0000001.n5;

public class PhoneNumber {
    private String countryCode;
    private String part1;
    private String part2;
    private String part3;

    public PhoneNumber(String phone) {
        if (phone.startsWith("+")) {
            countryCode = phone.substring(0, phone.length() - 10);
            part1 = phone.substring(phone.length() - 10, phone.length() - 7);
            part2 = phone.substring(phone.length() - 7, phone.length() - 4);
            part3 = phone.substring(phone.length() - 4);
        } else if (phone.startsWith("8") && phone.length() == 11) {
            countryCode = "+7";
            part1 = phone.substring(1, 4);
            part2 = phone.substring(4, 7);
            part3 = phone.substring(7);
        } else {
            throw new IllegalArgumentException("Неверный формат номера телефона:(");
        }
    }

    @Override
    public String toString() {
        return countryCode + part1 + "-" + part2 + "-" + part3;
    }

    public static void main(String[] args) {
        //Например
        PhoneNumber number1 = new PhoneNumber("+79175155655");
        System.out.println(number1); // +7-917-515-5655

        PhoneNumber number2 = new PhoneNumber("89171655655");
        System.out.println(number2); // +7-917-515-5655

        PhoneNumber number3 = new PhoneNumber("+133389652211");
        System.out.println(number3); // +1-333-896-5221
    }
}
