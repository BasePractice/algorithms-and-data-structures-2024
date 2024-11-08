package ru.mirea.practice.s0000001;

public abstract class Fourth {
    public static void main(String[] args) {
        String[] shirts = {"S001,Black Polo Shirt,Black,XL", "S002,Black Polo Shirt,Black,L", "S003,Blue PoloShirt,Blue,XL",
            "S004,Blue Polo Shirt,Blue,M", "S005,Tan PoloShirt,Tan,XL", "S006,Black T-Shirt,Black,XL", "S007,White TShirt,White,XL",
            "S008,White T-Shirt,White,L", "S009,GreenT-Shirt,Green,S", "S010,Orange T-Shirt,Orange,S", "S011,Maroon Polo Shirt,Maroon,S"
        };
        String[] s = new String[4];
        Shirt[] shirts1 = new Shirt[11];
        for (int i = 0;i < 11;i++) {
            s = shirts[i].split(",");
            shirts1[i] = new Shirt(s[0],s[1],s[2],s[3]);
            System.out.println(shirts1[i].toString());
        }
    }
}
