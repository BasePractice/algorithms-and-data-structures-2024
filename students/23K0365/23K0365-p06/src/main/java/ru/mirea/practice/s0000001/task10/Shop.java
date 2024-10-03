package ru.mirea.practice.s0000001.task10;

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

    //    public void delUr(Brands brandFinding){
    //        for(Computer x : this.comps) {
    //
    //            if(brandFinding == )
    //                Computer[] temp = new Computer[len - 1];
    //                for(int i = 0; i < len-1; i++) {
    //                    temp[i] = this.comps[i];
    //                }
    //                this.comps = temp;
    //            }
    //    }
    //}
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
