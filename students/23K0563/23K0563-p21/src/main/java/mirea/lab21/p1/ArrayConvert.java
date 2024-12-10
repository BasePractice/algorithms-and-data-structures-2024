package mirea.lab21.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayConvert {
    public <T> List<T> convert(T[] a) {
        List<T> l = new ArrayList<>();
        l.addAll(Arrays.asList(a));
        return l;
    }
}
