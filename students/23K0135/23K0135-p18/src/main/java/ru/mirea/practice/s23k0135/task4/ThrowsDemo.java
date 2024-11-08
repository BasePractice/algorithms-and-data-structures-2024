package ru.mirea.practice.s23k0135.task4;

public final class ThrowsDemo {

    private ThrowsDemo() {}

    public static void getDetails(String key) { // Method is now static
        try {
            if (key == null) {
                throw new NullPointerException("null key in getDetails");
            }
            // do something with the key
        } catch (NullPointerException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        getDetails(null); // Calling static method directly
    }
}

// Try-Catch:
// При вызове getDetails(null) теперь исключение NullPointerException перехватывается блоком catch.
// Вместо аварийного завершения программы выводится сообщение: Error: null key in getDetails.
