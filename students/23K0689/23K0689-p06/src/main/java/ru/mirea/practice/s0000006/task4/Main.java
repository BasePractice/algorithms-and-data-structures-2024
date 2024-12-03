package ru.mirea.practice.s0000006.task4;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        Priceable software = new Product("Microsoft Office 365 Subscription", 99.99);
        Priceable equipmentRental = new Service("Camera Go Pro 15", 50.00, 7); // аренда на 7 дней
        Priceable artPiece = new Product("Painting by Van Gogh", 1500000.00);

        printPrice(software);
        printPrice(equipmentRental);
        printPrice(artPiece);
    }

    private static void printPrice(Priceable item) {
        System.out.println(item.toString() + " -> Price: $" + String.format("%.2f", item.getPrice()));
    }
}
