package ru.mirea.practice.s0000001.pw41.task10;

public abstract class TestWothnes {
    public static void main(String[] args) {
        Train a = new Train(120, 9999, 200);
        Ship b = new Ship(30, 9999, 1478);
        Auto c = new Auto(170, 40, 40);
        Airplane d = new Airplane(340, 760, 500, 210);
        System.out.println("Poeple transportaion:");
        System.out.println(a.priceOfTranspotaionPeople(4, 80, 3000));
        System.out.println(b.priceOfTranspotaionPeople(4, 80, 3000));
        System.out.println(c.priceOfTranspotaionPeople(4, 80, 3000));
        System.out.println(d.priceOfTranspotaionPeople(4, 80, 3000));

        System.out.println("Goods transportaion:");
        System.out.println(a.priceOfTranspotaionGoods(15, 3, 3000));
        System.out.println(b.priceOfTranspotaionGoods(15, 3, 3000));
        System.out.println(c.priceOfTranspotaionGoods(15, 3, 3000));
        System.out.println(d.priceOfTranspotaionGoods(15, 3, 3000));


    }
}