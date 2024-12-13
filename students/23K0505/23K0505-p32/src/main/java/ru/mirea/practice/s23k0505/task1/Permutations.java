package ru.mirea.practice.s23k0505.task1;

public abstract class Permutations {

    static class Element {
        int value;
        int direction;

        Element(int value) {
            this.value = value;
            this.direction = -1;
        }
    }

    public static void generatePermutations(int n) {
        Element[] elements = new Element[n];

        for (int i = 0; i < n; i++) {
            elements[i] = new Element(i + 1);
        }

        while (true) {
            printCurrentPermutation(elements);
            int mobileIndex = getMobileIndex(elements);
            if (mobileIndex == -1) {
                break;
            }

            int newIndex = mobileIndex + elements[mobileIndex].direction;
            swap(elements, mobileIndex, newIndex);
            updateDirections(elements, elements[newIndex].value);
        }
    }

    private static void printCurrentPermutation(Element[] elements) {
        for (Element element : elements) {
            System.out.print(element.value + " ");
        }
        System.out.println();
    }

    private static int getMobileIndex(Element[] elements) {
        int mobileIndex = -1;
        for (int i = 0; i < elements.length; i++) {
            if (isMobile(elements, i) && (mobileIndex == -1 || elements[i].value > elements[mobileIndex].value)) {
                mobileIndex = i;
            }
        }
        return mobileIndex;
    }

    private static boolean isMobile(Element[] elements, int index) {
        if (elements[index].direction == -1) {
            return index > 0 && elements[index].value > elements[index - 1].value;
        } else {
            return index < elements.length - 1 && elements[index].value > elements[index + 1].value;
        }
    }

    private static void swap(Element[] elements, int i, int j) {
        Element temp = elements[i];
        elements[i] = elements[j];
        elements[j] = temp;
    }

    private static void updateDirections(Element[] elements, int mobileValue) {
        for (Element el : elements) {
            if (el.value > mobileValue) {
                el.direction = -el.direction;
            }
        }
    }

    public static void main(String[] args) {
        int n = 3;
        generatePermutations(n);
    }
}
