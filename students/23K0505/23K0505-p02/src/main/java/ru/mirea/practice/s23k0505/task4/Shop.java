package ru.mirea.practice.s23k0505.task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    List<Comp> comps = new ArrayList<>();

    public boolean add(String name, int ram) {
        boolean added = false;
        for (Comp comp : comps) {
            if (comp.getName().equals(name) & comp.getRam() == ram) {
                added = true;
                break;
            }
        }
        if (!added) {
            comps.add(new Comp(name, ram));
        }
        return added;
    }

    public boolean remove(String name, int ram) {
        boolean removed = false;
        for (Comp comp : comps) {
            if (comp.getName().equals(name) & comp.getRam() == ram) {
                comps.remove(comp);
                removed = true;
                break;
            }
        }
        return removed;
    }

    public boolean search(String name, int ram) {
        boolean found = false;
        for (Comp comp : comps) {
            if (comp.getName().equals(name) & comp.getRam() == ram) {
                found = true;
                break;
            }
        }
        return found;
    }

    @Override
    public String toString() {
        if (comps.isEmpty()) {
            return "В магазине ещё нет компьютеров";
        }
        StringBuilder strBuilder = new StringBuilder("Компьютеры в магазине:\n");
        for (Comp comp : comps) {
            strBuilder.append(comp.getName()).append(" (").append(comp.getRam()).append(" ГБ)\n");
        }
        return strBuilder.toString();
    }
}
