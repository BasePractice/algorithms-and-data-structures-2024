package mirea.lab32;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Prac32 {
    public static void main(String[] args) {
        int n = 5;
        JohnsonTroter j = new JohnsonTroter();
        List<int[]> l = j.permutations(n);
        System.out.println("n = " + n);
        for (int[] i : l) {
            System.out.println(Arrays.toString(i));
        }
        System.out.println(l.size() + " перестановок");
    }

    public static class JohnsonTroter {
        public static class Movable {
            int val;
            int dir;

            public Movable(int val, int dir) {
                this.val = val;
                this.dir = dir;
            }
        }

        public int indexOfMax(List<Movable> l) {
            int index = -1;
            int maxValue = 0;
            for (int i = 0; i < l.size(); i++) {
                Movable m = l.get(i);
                int nindex = i + m.dir;
                if (nindex >= 0 && nindex < l.size() && l.get(nindex).val < m.val) {
                    if (m.val > maxValue) {
                        maxValue = m.val;
                        index = i;
                    }
                }
            }
            return index;
        }

        public int[] convert(List<Movable> l) {
            return l.stream().mapToInt(x -> x.val).toArray();
        }

        public List<int[]> permutations(int n) {
            List<Movable> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(new Movable(i, -1));
            }
            List<int[]> perms = new ArrayList<>();
            perms.add(convert(list));

            while (true) {
                int index = indexOfMax(list);
                if (index != -1) {
                    Movable m = list.get(index);
                    int nindex = index + m.dir;

                    Movable temp = list.get(index);
                    list.set(index, list.get(nindex));
                    list.set(nindex, temp);

                    for (Movable i : list) {
                        if (i.val > m.val) {
                            i.dir = -i.dir;
                        }
                    }
                    perms.add(convert(list));
                } else {
                    break;
                }
            }
            return perms;
        }
    }
}
