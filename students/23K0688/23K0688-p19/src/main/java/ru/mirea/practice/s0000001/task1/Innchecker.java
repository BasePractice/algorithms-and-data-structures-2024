package ru.mirea.practice.s0000001.task1;

public class Innchecker {
    public void validator(User u) {
        switch (u.getInn().length()) {
            case 10:
                if ("legal".equals(u.getFace())) {
                    System.out.println("inn is valid");
                } else if ("physical".equals(u.getFace())) {
                    System.out.println("inn is valid , but face should be legal");
                }
                break;
            case 12:
                if ("physical".equals(u.getFace())) {
                    System.out.println("inn is valid");
                } else if ("legal".equals(u.getFace())) {
                    System.out.println("inn is valid , but face should be physical");
                }
                break;
            default:
                System.out.println("inn is not valid");
                break;
        }
    }
}
