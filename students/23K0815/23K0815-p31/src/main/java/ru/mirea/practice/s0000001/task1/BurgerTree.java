package ru.mirea.practice.s0000001.task1;

public abstract class BurgerTree {
    public static void displayBurgerTree(BurgerNode node) {
        if (node == null) {
            return;
        }

        System.out.print(node.patty);

        if (node.lettuce != null && node.onion != null) {
            System.out.print("-");
        }

        System.out.print(" ");
        displayBurgerTree(node.lettuce);
        displayBurgerTree(node.tomato);
        displayBurgerTree(node.onion);
    }

    public static void main(String[] args) {
        BurgerNode root = new BurgerNode(5);
        root.lettuce = new BurgerNode(2);
        root.tomato = new BurgerNode(3);
        root.onion = new BurgerNode(6);
        root.lettuce.lettuce = new BurgerNode(1);
        root.lettuce.onion = new BurgerNode(2);
        root.tomato.lettuce = new BurgerNode(4);
        root.onion.lettuce = new BurgerNode(5);
        root.onion.onion = new BurgerNode(6);

        displayBurgerTree(root);
    }
}
