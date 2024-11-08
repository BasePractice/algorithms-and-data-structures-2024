package ru.mirea.practice.s23k0120.task2;

//import java.awt.*;
import java.awt.Font;

public class BoxFont {
    Font font;
    String name;

    public BoxFont(String name, Font font) {
        this.name = name;
        this.font = font;
    }

    public static BoxFont getFont(String name) {
        return new BoxFont(name, new Font(name, Font.PLAIN, 16));
    }

    @Override
    public String toString() {
        return name;
    }
}
