package ru.mirea.practice.s0000001.task1;

class Cart {
    private Product[] cartItems = new Product[10];
    private int itemCount = 0;

    public void addProduct(Product product) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = product;
            itemCount++;
        }
    }

    public void purchaseProducts() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Покупка: " + cartItems[i]);
            total += cartItems[i].getPrice();
        }
        System.out.println("Общая сумма: " + total);
    }
}
