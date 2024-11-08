package ru.mirea.practice.s0000001;

public final class AddressSeparator {
    private AddressSeparator() {

    }

    public static void main(String[] args) {
        String[] testAddresses = {
            "Канада, Онтарио, Торонто, улица Университет, 100, A, 200",
            "Австралия, Новый Южный Уэльс, Сидней, улица Питт, 50, 2, 5",
            "Италия; Ломбардия; Милан; улица Монтенаполеоне; 12; 1; 3",
            "Япония, Токио, Шибуя, улица Харадзюку, 5-10-1",
            "Бразилия, Сан-Паулу, Сан-Паулу, Avenida Paulista, 1578, 3",
            "Индия; Махараштра; Мумбаи; улица Колаба; 12; A; 101",
            "Южноафриканская Республика, Гаутенг, Йоханнесбург, улица Эдвард, 22",
            "Финляндия; Уусимаа; Хельсинки; улица Эспланаади; 15; B; 3"
        };

        System.out.println("Разбор адресов с использованием split():");
        for (String address : testAddresses) {
            Address addr = new Address();
            addr.parseAddressWithComma(address);
            System.out.println(addr);
            System.out.println("-----------------------");
        }

        System.out.println("Разбор адресов с использованием StringTokenizer:");
        for (String address : testAddresses) {
            Address addr = new Address();
            addr.parseAddressWithTokenizer(address);
            System.out.println(addr);
            System.out.println("-----------------------");
        }
    }
}
