package ru.mirea.practice.s0000001.task2;

import java.util.ArrayList;
import java.util.List;

public final class Main {

    private Main() {}

    public static void main(String[] args) {
        List<Comp> computers = new ArrayList<>();

        computers.add(new Comp(Brands.DELL, new Processor("Intel Core i7", 3.5), new Memorys("DDR4", 16), new Monitors("1920x1080", 24)));
        computers.add(new Comp(Brands.HP, new Processor("AMD Ryzen 5", 3.6), new Memorys("DDR4", 8), new Monitors("2560x1440", 27)));
        computers.add(new Comp(Brands.APPLE, new Processor("Apple M1", 3.2), new Memorys("DDR4", 16), new Monitors("2560x1600", 24)));
        computers.add(new Comp(Brands.ASUS, new Processor("Intel Core i5", 3.0), new Memorys("DDR4", 8), new Monitors("1920x1080", 21.5)));
        computers.add(new Comp(Brands.LENOVO, new Processor("Intel Core i9", 3.8), new Memorys("DDR4", 32), new Monitors("3840x2160", 27)));

        for (Comp computer : computers) {
            System.out.println(computer);
        }
    }
}