package mirea.lab24.p2;

public class FunctionalChair implements Chair {
    @Override
    public void sit() {
        System.out.println("Функциональный стул");
    }

    public int sum(int a, int b) {
        return a + b;
    }
}
