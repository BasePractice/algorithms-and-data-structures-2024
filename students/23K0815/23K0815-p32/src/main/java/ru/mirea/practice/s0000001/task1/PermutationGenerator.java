package ru.mirea.practice.s0000001.task1;

import java.util.ArrayList;
import java.util.List;

public final class PermutationGenerator {

    private PermutationGenerator() {
        // Prevent instantiation
    }

    static class Item {
        int number;
        boolean isMovingRight;

        Item(int number) {
            this.number = number;
            this.isMovingRight = false; // Initially set to move left
        }
    }

    public static void main(String[] args) {
        int count = 10;  // Changed from 4 to 10
        createPermutations(count);
    }

    public static void createPermutations(int count) {
        List<Item> items = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            items.add(new Item(i));
        }

        displayPermutation(items);

        while (true) {
            int indexOfLargestMovable = findLargestMovable(items);
            if (indexOfLargestMovable == -1) {
                break;
            }

            Item largestItem = items.get(indexOfLargestMovable);
            int targetIndex = largestItem.isMovingRight ? indexOfLargestMovable + 1 : indexOfLargestMovable - 1;
            swapItems(items, indexOfLargestMovable, targetIndex);

            for (Item item : items) {
                if (item.number > largestItem.number) {
                    item.isMovingRight = !item.isMovingRight; // Change direction
                }
            }

            displayPermutation(items);
        }
    }

    private static int findLargestMovable(List<Item> items) {
        int movableIndex = -1;
        for (int i = 0; i < items.size(); i++) {
            Item currentItem = items.get(i);
            int neighborIndex = currentItem.isMovingRight ? i + 1 : i - 1;

            if (neighborIndex >= 0 && neighborIndex < items.size() && currentItem.number > items.get(neighborIndex).number) {
                if (movableIndex == -1 || currentItem.number > items.get(movableIndex).number) {
                    movableIndex = i;
                }
            }
        }
        return movableIndex;
    }

    private static void swapItems(List<Item> items, int firstIndex, int secondIndex) {
        Item temp = items.get(firstIndex);
        items.set(firstIndex, items.get(secondIndex));
        items.set(secondIndex, temp);
    }

    private static void displayPermutation(List<Item> items) {
        for (Item item : items) {
            System.out.print(item.number + " ");
        }
        System.out.println();
    }
}