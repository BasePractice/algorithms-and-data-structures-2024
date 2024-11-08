package ru.mirea.practice.s23k0120.task2;

import java.util.ArrayList;
import java.util.Collection;

public class LabClass extends ArrayList<Student> {

    public LabClass() {
        super();
    }

    public LabClass(Collection<? extends Student> c) {
        super(c);
    }
}
