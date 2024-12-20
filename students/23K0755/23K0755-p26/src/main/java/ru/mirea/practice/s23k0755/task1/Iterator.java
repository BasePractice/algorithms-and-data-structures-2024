package ru.mirea.practice.s23k0755.task1;

import java.util.List;

public class Iterator {

    private int curentInd;

    public Iterator() {
        this.curentInd = 0;
    }

    public int getCurentInd() {
        return curentInd;
    }

    public void next(List<?> list) {
        if (curentInd + 1 < list.size()) {
            System.out.println(list.get(curentInd));
        } else {
            System.out.println("Ошибка: выход за пределы списка");
        }
    }

    public boolean hasNext(List<?> list) {
        return curentInd + 1 < list.size();
    }
}
