package ru.mirea.practice.s0000001.task2;

enum Size {
    XXS(32), XS(34), S(36), M(38), L(40);

    private final int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public String getDescription() {
        return this == XXS ? "Детский размер" : "Взрослый размер";
    }

    public int getEuroSize() {
        return euroSize;
    }
}

interface MenClothing {
    void dressMan();
}

interface WomenClothing {
    void dressWomen();
}

abstract class Clothes {
    private Size size;
    private double price;
    private String color;

    public Clothes(Size size, double price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }
}

class TShirt extends Clothes implements MenClothing, WomenClothing {
    public TShirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужская футболка: Размер %s, Цена %.2f, Цвет %s%n",
                getSize(), getPrice(), getColor());
    }

    @Override
    public void dressWomen() {
        System.out.printf("Женская футболка: Размер %s, Цена %.2f, Цвет %s%n",
                getSize(), getPrice(), getColor());
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Мужские штаны: Размер %s, Цена %.2f, Цвет %s%n",
                getSize(), getPrice(), getColor());
    }

    @Override
    public void dressWomen() {
        System.out.printf("Женские штаны: Размер %s, Цена %.2f, Цвет %s%n",
                getSize(), getPrice(), getColor());
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressWomen() {
        System.out.printf("Юбка: Размер %s, Цена %.2f, Цвет %s%n",
                getSize(), getPrice(), getColor());
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.printf("Галстук: Размер %s, Цена %.2f, Цвет %s%n",
                getSize(), getPrice(), getColor());
    }
}

class Atelier {
    public void dressWomen(Clothes[] clothes) {
        System.out.println("Женская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof WomenClothing) {
                ((WomenClothing) c).dressWomen();
            }
        }
    }

    public void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда:");
        for (Clothes c : clothes) {
            if (c instanceof MenClothing) {
                ((MenClothing) c).dressMan();
            }
        }
    }
}