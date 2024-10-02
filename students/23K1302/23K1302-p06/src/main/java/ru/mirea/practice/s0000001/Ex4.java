package ru.mirea.practice.s0000001;

public final class Ex4 {

    private Ex4() {
        // Пустота
    }

    public static void main(String[] args) {

        Product phone = new Product("Iphone 14", 999.99);
        Service cleaning = new Service("Клининговая служба", 150.00);
        Ticket concert = new Ticket("Билет на концерт", 80.50);

        System.out.println(phone.getName() + " Стоит: $" + phone.getPrice());
        System.out.println(cleaning.getDescription() + " Стоит: $" + cleaning.getPrice());
        System.out.println(concert.getEvent() + " Стоит: $" + concert.getPrice());
    }
}
