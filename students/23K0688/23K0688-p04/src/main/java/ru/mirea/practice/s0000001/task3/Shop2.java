package ru.mirea.practice.s0000001.task3;

public class Shop2 {
    public void tutorial() {
        System.out.println("available actions:1-print all catalogues, 2-print wares of a catalogue, 3-add to list");
        System.out.println(", 4-check list ,5 buy 0- tutorial");
    }

    public void printCatalogues() {
        for (Catalogue c : Catalogue.values()) {
            System.out.println(c);
        }
    }

    public void printwares(Catalogue c) {
        c.getWares();
    }

    public Wares[] addtolist(Wares[] w, Wares ware) {
        for (int i = 0;i < w.length;i++) {
            if (w[i] == null) {
                w[i] = ware;
                break;
            } else if (i == w.length - 1) {
                System.out.println("no available space");
            }
        }
        return w;
    }

    public void listlist(Wares[] wares) {
        for (int i = 0;i < wares.length;i++) {
            if (wares[i] != null) {
                System.out.println("N" + (i + 1) + "-" + wares[i]);
            } else {
                System.out.println("empty");
            }
        }
    }

    public int suml(Wares[] list) {
        int sum = 0;
        for (Wares wares : list) {
            if (wares != null) {
                sum += wares.getPrice();
            }
        }
        return sum;
    }

    public int checker(int money,int sum) {
        if (money >= sum) {
            System.out.println("Thank you for your purchase : ");
            return money - sum;
        } else {
            System.out.println("Not enough money for purchase, required amount is :  " + sum + ".");
        }
        return money;
    }

}
