package mirea.lab24.p2;

interface Chair {
    default void sit() {
        System.out.println("Обычный стул");
    }
}
