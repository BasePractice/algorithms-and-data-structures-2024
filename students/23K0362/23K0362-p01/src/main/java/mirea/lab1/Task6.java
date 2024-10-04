package mirea.lab9;

abstract class Task6 {
    public static void main(String[] args) {
        int numVal = 10;
        for (int i = 1; i <= numVal; i++) {
            System.out.format("%.2f \n", (float)1 / i);
        }
    }
}
