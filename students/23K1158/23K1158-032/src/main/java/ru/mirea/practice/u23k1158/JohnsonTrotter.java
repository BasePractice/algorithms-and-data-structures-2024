package ru.mirea.practice.u23k1158;

public abstract class JohnsonTrotter {
    private static final boolean isleft = true;
    private static final boolean isright = false;
    public static int findPosition(int[] array, int size, int number) {
        for (int i = 0; i < size; i++) {
            if (array[i] == number) {
                return i + 1;
            }
        }
        return 0;
    }
    public static int getLargestMobile(int[] array, boolean[] directions, int size) {
        int largest = 0;
        int mobile = 0;
        for (int i = 0; i < size; i++) {
            if (directions[array[i] - 1] == isright && i != 0) {
                if (array[i] > array[i - 1] && array[i] > largest) {
                    mobile = array[i];
                    largest = mobile;
                }
            }
            if (directions[array[i] - 1] == isleft && i != size - 1) {
                if (array[i] > array[i + 1] && array[i] > largest) {
                    mobile = array[i];
                    largest = mobile;
                }
            }
        }
        return mobile == 0 && largest == 0 ? 0 : mobile;
    }
    public static void displayPermutation(int[] array, boolean[] directions, int size) {
        int mobile = getLargestMobile(array, directions, size);
        int position = findPosition(array, size, mobile);
        if (directions[array[position - 1] - 1] == isright) {
            int temp = array[position - 1];
            array[position - 1] = array[position - 2];
            array[position - 2] = temp;
        } else if (directions[array[position - 1] - 1] == isleft) {
            int temp = array[position];
            array[position] = array[position - 1];
            array[position - 1] = temp;
        }
        for (int i = 0; i < size; i++) {
            if (array[i] > mobile) {
                directions[array[i] - 1] = (directions[array[i] - 1] == isleft) ? isright : isleft;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static int calculateFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static void generatePermutations(int size) {
        int[] array = new int[size];
        boolean[] directions = new boolean[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < size; i++) {
            directions[i] = isright;
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 1; i < calculateFactorial(size); i++) {
            displayPermutation(array, directions, size);
        }
    }
    public static void main(String[] args) {
        int n = 3;
        generatePermutations(n);
    }
}
