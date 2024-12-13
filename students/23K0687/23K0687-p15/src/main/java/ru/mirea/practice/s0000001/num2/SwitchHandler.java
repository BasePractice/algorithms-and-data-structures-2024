package ru.mirea.practice.s0000001.num2;

public final class SwitchHandler {
    private SwitchHandler() {
    }

    public static void handleSwitch(String sc) {
        switch (sc) {
            case "Australia":
                System.out.println("Вы выбрали Австралию");
                break;
            case "China":
                System.out.println("Вы выбрали Китай");
                break;
            case "England":
                System.out.println("Вы выбрали Англию");
                break;
            case "Russia":
                System.out.println("Вы выбрали Россию");
                break;
            default:
                System.out.println("Неизвестная страна");
                break;
        }
    }
}
