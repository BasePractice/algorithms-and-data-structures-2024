package ru.mirea.practice.s23f0011.task5;

import static ru.mirea.practice.s23f0011.task5.PhoneNumberFormatter.formatPhoneNumber;

public abstract class Tester {
    public static void main(String[] args) {
        String phoneNumber1 = "+79175655655";
        String phoneNumber2 = "+104289652211";
        String phoneNumber3 = "89175655655";

        System.out.println(formatPhoneNumber(phoneNumber1)); // +7-917-565-5655
        System.out.println(formatPhoneNumber(phoneNumber2)); // +10-428-965-2211
        System.out.println(formatPhoneNumber(phoneNumber3)); // +7-917-565-5655
    }
}
