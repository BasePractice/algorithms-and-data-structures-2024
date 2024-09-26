package ru.mirea.practice.s0000001.task1;
import java.lang.*;

public abstract class TesterAuthor {
    public static void main(String[] args) {
        Author kris = new Author("Kris","qwer@mail.com",'m');
        System.out.println(kris);
        kris.setEmail("qawsed@mail.ru");
        System.out.println(kris);
        System.out.println("name is "+kris.getName());
    }
}
