package ru.mirea.practice.s0000001.num2;

public abstract class Main {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the image path.");
            return;
        }

        String imgPath = args[0];
        ImageWindow window = new ImageWindow(imgPath);
        window.setVisible(true);
    }
}
