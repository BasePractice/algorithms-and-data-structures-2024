package ru.mirea.practice.s23K0135.pw41.task9;

public class FurnitureShop {
    private Chair[] chairs;
    private Closet[] closets;

    public double buyChair(Chair choice) {
        Chair[] arr = new Chair[chairs.length];
        int j = 0;
        for (int i = 0; i < (chairs.length); i++) {
            if (chairs[i] != choice) {
                arr[j] = chairs[i];
                j++;
            }
        }
        chairs = arr;
        System.out.println("This item added to ur cart");
        return choice.getPrice();
    }

    public double buyCloset(Closet choice) {
        Closet[] arr = new Closet[closets.length - 1];
        int j = 0;
        for (int i = 0; i < (closets.length); i++) {
            if (closets[i] != choice) {
                arr[j] = closets[i];
                j++;
                System.out.println("This item added to ur cart");
            }
        }
        closets = arr;
        return choice.getPrice();
    }

    public FurnitureShop(Chair[] chairs, Closet[] closets) {
        this.chairs = chairs;
        this.closets = closets;
    }
}
