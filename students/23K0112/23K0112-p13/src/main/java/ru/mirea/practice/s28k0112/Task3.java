package ru.mirea.practice.s28k0112;

public final class Task3 {
    private Task3() {

    }

    public static void main(String[] args) {
        Address address1 = new Address();
        address1.parseAddressWithComma("Россия, Москва, Москва, Арбат, 12, 3, 45");

        Address address2 = new Address();
        address2.parseAddressWithTokenizer("США; Калифорния; Лос-Анджелес; Винсент; 123; A; 5");

        Address address3 = new Address();
        address3.parseAddressWithComma("Франция, Иль-де-Франс, Париж, Елисейские поля, 45");

        Address address4 = new Address();
        address4.parseAddressWithTokenizer("Германия. Бавария. Мюнхен. Максимилианштрассе. 78. B. 3");

        System.out.println(address1 + "\n");
        System.out.println(address2 + "\n");
        System.out.println(address3 + "\n");
        System.out.println(address4);
    }
}
