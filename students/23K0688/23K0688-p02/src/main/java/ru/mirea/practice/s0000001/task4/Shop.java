package ru.mirea.practice.s0000001.task4;

import java.util.Objects;

public class Shop {

    public void tutorial() {
        System.out.println("available actions:1-list all computers, 2-add computer, 3-delete computer");
        System.out.println("4-find computer , 5-get computer , 0- tutorial");
    }

    public void listpcs(Pc[] pc) {
        for (int i = 0;i < pc.length;i++) {
            if (pc[i] != null) {
                System.out.println("N" + (i + 1) + "-" + pc[i]);
            } else {
                System.out.println("empty");
            }
        }
    }

    public Pc[] setPc(Pc[] pc,String gpu,String cpu,String os,String origin,String ram) {
        for (int i = 0;i < pc.length;i++) {
            if (pc[i] == null) {
                Pc pc1 = new Pc("","","","","");
                pc1.setGpu(gpu);
                pc1.setCpu(cpu);
                pc1.setRam(ram);
                pc1.setOs(os);
                pc1.setOrigin(origin);
                pc[i] = pc1;
                break;
            } else if (i == pc.length - 1) {
                System.out.println("no available space");
            }
        }
        return pc;
    }

    public Pc[] delPc(Pc[] pc,int num) {
        pc[num - 1] = null;
        System.out.println("computer deleted successfully:");
        return pc;
    }

    public void search(Pc[] pc,String criteria) {
        System.out.println("computers found with " + criteria + ":");
        for (int i = 0,cnt = 0;i < pc.length;i++) {
            if (pc[i] == null) {
                continue;
            }
            if (Objects.equals(pc[i].getGpu(),criteria)) {
                System.out.println("N" + (i + 1));
                cnt = 1;
            } else if (Objects.equals(pc[i].getCpu(),criteria)) {
                System.out.println("N" + i);
                cnt = 1;
            } else if (Objects.equals(pc[i].getRam(),criteria)) {
                System.out.println("N" + i);
                cnt = 1;
            } else if (Objects.equals(pc[i].getOs(),criteria)) {
                System.out.println("N" + i);
                cnt = 1;
            } else if (Objects.equals(pc[i].getOrigin(),criteria)) {
                System.out.println("N" + i);
                cnt = 1;
            } else if (cnt == 0) {
                System.out.println("None");
            }
        }
    }

    public Pc getPc(Pc[] p1,int num) {
        return p1[num - 1];
    }
}