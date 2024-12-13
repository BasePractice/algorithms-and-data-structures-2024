package ru.mirea.practice.s0000001.num2;

public final class Main {
    private Main() {
    }

    public static void main(String[] args) {
        String[] s = {
            "S001,Black Polo Shirt,Black,XL",
            "S002,Black Polo Shirt,Black,L",
            "S003,Blue Polo Shirt,Blue,XL",
            "S004,Blue Polo Shirt,Blue,M",
            "S005,Tan Polo Shirt,Tan,XL",
            "S006,Black T-Shirt,Black,XL",
            "S007,White T-Shirt,White,XL",
            "S008,White T-Shirt,White,L",
            "S009,Green T-Shirt,Green,S",
            "S010,Orange T-Shirt,Orange,S",
            "S011,Maroon Polo Shirt,Maroon,S"
        };

        Shirt[] sh = new Shirt[s.length];
        for (int i = 0; i < s.length; i++) {
            sh[i] = new Shirt(s[i]);
        }

        for (Shirt shrt : sh) {
            System.out.println(shrt + "\n");
        }
    }
}
