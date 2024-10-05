package ru.mirea.practice.s23L0908;

final class XSort {
    private XSort() {
    }

    public static void sort(Pupil[] pupils) {
        for (int i = 1; i < pupils.length; i++) {
            Pupil temp = pupils[i];
            int j = i - 1;
            while (j >= 0 && pupils[j].getIdentifier() > temp.getIdentifier()) {
                pupils[j + 1] = pupils[j];
                j = j - 1;
            }
            pupils[j + 1] = temp;
        }
    }
}
