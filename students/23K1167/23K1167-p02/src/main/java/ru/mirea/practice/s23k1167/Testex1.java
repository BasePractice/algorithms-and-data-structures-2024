package ru.mirea.practice.s23k1167;

public final class Testex1 {
    private Testex1() {
    }

    public static void main(String[] args) {
        Ex1 a = new Ex1("Methodiy", "mirea@edu.mirea.ru", 'x');
        System.out.println("Author " + a);
        System.out.println("getName " + a.getName());
        System.out.println("getEmail " + a.getEmail());
        System.out.println("getGender " + a.getGender());
        a.setEmail("mmmirea@edu.mirea.ru");
        System.out.println("setEmail " + a.getEmail());
    }
}
