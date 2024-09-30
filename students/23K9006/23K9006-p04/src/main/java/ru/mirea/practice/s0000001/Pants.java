public class Pants extends Clothes implements MenClothing, WomenClothing {
    public Pants(Size size, double price, String color) {
        super(size, price, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Штаны для мужчин: размер " + getSize() + ", цвет " + getColor() + ", цена " + getPrice());
    }

    @Override
    public void dressWomen() {
        System.out.println("Штаны для женщин: размер " + getSize() + ", цвет " + getColor() + ", цена " + getPrice());
    }
}
