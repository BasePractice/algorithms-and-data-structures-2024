package ru.mirea.practice.s0000001.task4;

import java.util.Objects;
import java.util.Scanner;

public class Shop {
    private Scanner sc = new Scanner(System.in);

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

    public Pc[] setPc(Pc[] pc) {
        for (int i = 0;i < pc.length;i++) {
            if (pc[i] == null) {
                Pc pc1 = new Pc("","","","","");
                System.out.println("input gpu:");
                pc1.setGpu(sc.nextLine());
                System.out.println("input cpu:");
                pc1.setCpu(sc.nextLine());
                System.out.println("input ram:");
                pc1.setRam(sc.nextLine());
                System.out.println("input os:");
                pc1.setOs(sc.nextLine());
                System.out.println("input origin:");
                pc1.setOrigin(sc.nextLine());
                pc[i] = pc1;
                System.out.println(pc1 + " added successfully");
                break;
            } else if (i == pc.length - 1) {
                System.out.println("no available space");
            }
        }
        return pc;
    }

    public Pc[] delPc(Pc[] pc) {
        System.out.println("number of computer to delete:");
        pc[sc.nextInt() - 1] = null;
        System.out.println("computer deleted successfully:");
        return pc;
    }

    public void search(Pc[] pc) {
        System.out.println("input criteria:");
        String criteria = sc.nextLine();
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

    public Pc getPc(Pc[] p1) {
        System.out.println("input pc number:");
        return p1[sc.nextInt() - 1];
    }
}
