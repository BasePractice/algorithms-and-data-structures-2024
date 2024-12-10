package ru.mirea.practice.lab13;

public abstract class AddressTest {
    public static void main(String[] args) {
        Address address1 = new Address();
        address1.parseAddressComma("Россия, Московская область, Клин, Ленина, 10, 1, 20");
        System.out.println("Адрес с разделителем ',':\n" + address1);

        Address address2 = new Address();
        address2.parseAddressMultipleDelimiters("Россия. Московская область; Клин, Ленина, 10; 1. 20");
        System.out.println("Адрес с несколькими разделителями:\n" + address2);

        Address address3 = new Address();
        address3.parseAddressComma("  Россия  ,  Московская область , Москва , Клин , 10 , 1 , 20 ");
        System.out.println("Адрес с разделителем ',' и пробелами:\n" + address3);

        Address address4 = new Address();
        address4.parseAddressMultipleDelimiters("США, Калифорния; Сан-Франциско, Бейкер-стрит, 221B, - , 5");
        System.out.println("Адрес с несколькими разделителями и пропуском полей:\n" + address4);
    }
}

