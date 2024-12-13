package ru.mirea.practice.s23k0350;

import java.util.Map;

abstract class Main28 {
    public static void main(String[] args) {
        Map<String, String> nmpp = NameMap.createMap();
        System.out.println(NameMap.getSameFirstNameCount(nmpp));
        System.out.println(NameMap.getSameLastNameCount(nmpp));

    }
}
