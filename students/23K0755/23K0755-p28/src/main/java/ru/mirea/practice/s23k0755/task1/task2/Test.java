package ru.mirea.practice.s23k0755.task1.task2;

import java.util.Map;

abstract class Test {
    public static void main(String[] args) {
        Map<String, String> map = Tree.createMap();
        int repeatsFirstName = Tree.counterFirtsName(map);
        int repeatsLastName = Tree.counterLastName(map);

        System.out.println("Same first name count: " + repeatsFirstName);
        System.out.println("Same last name count: " + repeatsLastName);
    }
}
