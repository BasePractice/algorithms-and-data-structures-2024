package ru.mirea.practice.s23k0143;

abstract class Clothes {
    Size size;
    double price;
    String color;

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
        System.out.println("Одеваю мужчину в футболку цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }

    public void dressWomen() {
        System.out.println("Одеваю женщину в футболку цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }
}

class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваю мужчину в штаны цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }

    public void dressWomen() {
        System.out.println("Одеваю женщину в штаны цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }
}

class Skirt extends Clothes implements WomenClothing {
    public Skirt(Size size, double price, String color) {
        super(size, price, color);
    }

    public void dressWomen() {
        System.out.println("Одеваю женщину в юбку цвета: " + getColor() + ", размер: " + getSize().getDescription() + ", цена: " + getPrice());
    }
}

class Tie extends Clothes implements MenClothing {
    public Tie(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Одеваю мужчину в галстук цвета: " + getColor() + ", размер: " + getSize().getDescription() + ",  цена: " + getPrice());
    }
}
