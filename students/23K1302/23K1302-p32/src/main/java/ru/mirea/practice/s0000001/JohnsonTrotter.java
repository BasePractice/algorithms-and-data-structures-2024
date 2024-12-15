package ru.mirea.practice.s0000001;

import java.util.ArrayList;
import java.util.List;

public final class JohnsonTrotter {

    private JohnsonTrotter() {
        // dhtnsb
    }

    static class Element {
        int value;
        boolean direction;

        Element(int value) {
            this.value = value;
            this.direction = false;
        }
    }

    public static void main(String[] args) {
        int n = 4;
        generatePermutations(n);
    }

    public static void generatePermutations(int n) {
        List<Element> elements = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            elements.add(new Element(i));
        }

        printPermutation(elements);

        while (true) {
            int largestMovableIndex = getLargestMovableIndex(elements);
            if (largestMovableIndex == -1) {
                break;
            }

            Element largestMovable = elements.get(largestMovableIndex);
            int swapIndex = largestMovable.direction ? largestMovableIndex + 1 : largestMovableIndex - 1;
            swap(elements, largestMovableIndex, swapIndex);

            for (Element e : elements) {
                if (e.value > largestMovable.value) {
                    e.direction = !e.direction;
                }
            }

            printPermutation(elements);
        }
    }

    private static int getLargestMovableIndex(List<Element> elements) {
        int largestMovableIndex = -1;
        for (int i = 0; i < elements.size(); i++) {
            Element current = elements.get(i);
            int neighborIndex = current.direction ? i + 1 : i - 1;

            if (neighborIndex >= 0 && neighborIndex < elements.size() && current.value > elements.get(neighborIndex).value) {
                if (largestMovableIndex == -1 || current.value > elements.get(largestMovableIndex).value) {
                    largestMovableIndex = i;
                }
            }
        }
        return largestMovableIndex;
    }

    private static void swap(List<Element> elements, int i, int j) {
        Element temp = elements.get(i);
        elements.set(i, elements.get(j));
        elements.set(j, temp);
    }

    private static void printPermutation(List<Element> elements) {
        for (Element e : elements) {
            System.out.print(e.value + " ");
        }
        System.out.println();
    }
}
