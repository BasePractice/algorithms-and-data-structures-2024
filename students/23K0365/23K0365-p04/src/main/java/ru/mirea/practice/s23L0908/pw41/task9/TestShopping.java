package ru.mirea.practice.s23L0908.pw41.task9;

public abstract class TestShopping {
    public static void main(String[] args) {
        Chair[] a = {
            new Chair("Blue",100.1,100.1,"wood",90,true),
            new Chair("Red",2.1,99.9,"metal",1,false),};
        Closet[] b = {
            new Closet("Black",300.1,800.67,"wood",
                        87,true,3),
            new Closet("white",0.1,999999.67,"plastic",
                        67,false,3),};
        FurnitureShop arr = new FurnitureShop(a,b);
        double cart = 0;

        cart += arr.buyChair(new Chair("Blue",100.1,100.1,
                "wood",90,true));
        System.out.println("You owe: " + cart);
        System.out.println(b[1].getMaterial());
    }
}
