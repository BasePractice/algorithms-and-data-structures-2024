package ru.mirea.practice.s23k0368.prog2;

import java.util.Map;

public abstract class Main {
    public static void main(String[] args) {
        Metods metod = new Metods();
        Map<String, String> map = metod.createMap();
        System.out.println(metod.getSameFirstNamecount(map));
        System.out.println(metod.getSameLastNamecount(map));
        //Важное замечание! Нельзя хранить пару одинаковых ключей, значение будет перезаписано и на экране мы увидем 0
        //Имена могут повторяться (Сразу не заметил)
    }
}
