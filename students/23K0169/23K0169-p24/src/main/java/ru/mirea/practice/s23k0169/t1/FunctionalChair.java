package ru.mirea.practice.s23k0169.t1;

class FunctionalChair implements Chair {
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void sit() {
        System.out.println("Сидим на функциональном стуле");
    }
}
