package ru.mirea.practice.s23k0120.task1;

import java.util.ArrayList;
import java.util.List;

public class TwoThreeTreeNode<E extends Comparable<E>> {
    List<E> dataArr;
    int t;
    List<TwoThreeTreeNode<E>> children;
    int numOfKeys;
    boolean isLeaf;

    public TwoThreeTreeNode(boolean isLeaf) {
        this.t = 2;
        this.isLeaf = isLeaf;

        dataArr = new ArrayList<>();
        for (int i = 0; i < 2 * t - 1; i++) {
            dataArr.add(null);
        }

        children = new ArrayList<>();
        for (int i = 0; i < 2 * t; i++) {
            children.add(null);
        }
        numOfKeys = 0;
    }

    public TwoThreeTreeNode<E> search(E data) {
        int i = 0;

        while (i < numOfKeys && data.compareTo(dataArr.get(i)) > 0) {
            i++;
        }

        if (data.compareTo(dataArr.get(i)) == 0) {
            return this;
        }

        if (isLeaf) {
            return null;
        }

        return children.get(i).search(data);
    }

    public void insertNonFull(E data) {
        int i = numOfKeys - 1;

        if (isLeaf) {
            while (i >= 0 && data.compareTo(dataArr.get(i)) < 0) {
                dataArr.set(i + 1, dataArr.get(i));
                i--;
            }
            dataArr.set(i + 1, data);
            numOfKeys++;
        } else {
            while (i >= 0 && data.compareTo(dataArr.get(i)) < 0) {
                i--;
            }
            i++;

            if (children.get(i).numOfKeys == 2 * t - 1) {
                splitChild(i, children.get(i));
                if (data.compareTo(dataArr.get(i)) > 0) {
                    i++;
                }
            }
            children.get(i).insertNonFull(data);
        }
    }

    public void splitChild(int ind, TwoThreeTreeNode<E> y) {
        TwoThreeTreeNode<E> z = new TwoThreeTreeNode<E>(y.isLeaf);
        z.numOfKeys = t - 1;

        for (int i = 0; i < t - 1; i++) {
            z.dataArr.set(i, y.dataArr.get(i + t));
        }

        if (!y.isLeaf) {
            for (int i = 0; i < t; i++) {
                z.children.set(i, y.children.get(i + t));
            }
        }

        y.numOfKeys = t - 1;

        for (int i = numOfKeys; i >= ind + 1; i--) {
            children.set(i + 1, children.get(i));
        }

        children.set(ind + 1, z);

        for (int i = numOfKeys - 1; i >= ind; i--) {
            dataArr.set(i + 1, dataArr.get(i));
        }

        dataArr.set(ind, y.dataArr.get(t - 1));
        numOfKeys++;
    }

    public void printInOrder() {
        int i;
        for (i = 0; i < numOfKeys; i++) {
            if (!isLeaf) {
                children.get(i).printInOrder();
            }
            System.out.print(dataArr.get(i) + " ");
        }
        if (!isLeaf) {
            children.get(i).printInOrder();
        }
    }
}
