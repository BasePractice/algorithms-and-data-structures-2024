package ru.mirea.practice.s23f0011.task1;

public abstract class TestAuthor {
    public static void main(String[] args) {
        Author obj1 = new Author("Maksim", "maksim@mirea.ru", 'm');
        System.out.println(obj1.toString());
        Author obj2 = new Author("Olga", "olga@mirea.ru", 'w');
        System.out.println(obj2.toString());
        obj2.setEmail("olga_m@mirea.ru");
        System.out.println(obj2.toString());
    }
}
