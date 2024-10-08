package ru.mirea.practice.s23K0135.task10;

public class Shop {
    private Computer[] comps;
    int len;

    public Shop(Computer[] comps) {
        this.comps = comps;
        this.len = comps.length;
    }

    public Computer findUr(Brands brandFinding, int hzFinding) {
        Computer a = new Computer();
        for (Computer x : this.comps) {
            if (x.getProc().getHz() == hzFinding) {
                for (Brands r : Brands.values()) {
                    if (r == brandFinding) {
                        a = x;
                        break;
                    }
                }
            }
        }
        return a;
    }

    @Override
    public String toString() {
        System.out.println("Shop:\n");
        for (Computer x : this.comps) {
            System.out.println(x.getBra().name()
                    + x.getMem().getHz() + "\n");
        }
        return "";
    }
}
