package ru.mirea.practice.s0000001.tasksfrom1to3;

import java.util.Iterator;
import java.util.LinkedList;

public class HasgTab {
    private LinkedList<Contentt>[] lst;

    public void hashTabInit() {
        lst = new LinkedList[100]; //макс. хэш-код = 100, в общем случае нужно
        // бло бы использовать АrrayList<LinkedList<Content>>
        for (int i = 0; i < 100; i++) {
            lst[i] = new LinkedList<>();
        }
    }

    public int hashtabHash(String key) {
        if (key != null) {
            int hashCod = 1;
            for (char c : key.toCharArray()) {
                hashCod += c;
            }
            return hashCod % (key.length() * 10);
        } else {
            return 0;
        }
    }

    public void hashTabAdd(String key, Object o) {
        int i = hashtabHash(key);
        lst[i].add(new Contentt(key, o));
    }

    public void hashTabLookUp() {
        for (int i = 0; i < 100; i++) {
            LinkedList<Contentt> temp = lst[i];
            if (!temp.isEmpty()) {
                System.out.print("index: " + i + "; ");
                for (Contentt x : temp) {
                    System.out.print("key: " + x.key + ",  value: " + x.val + "; ");
                }
                System.out.print("\n");
            }
        }
    }

    public Object hashTabDelete(String key) {
        int i = hashtabHash(key);
        Object found = null;
        LinkedList<Contentt> temp = lst[i];
        Iterator<Contentt> itering = temp.iterator();
        while (itering.hasNext()) {
            Contentt a = itering.next();
            if (a.key.equals(key)) {
                found = a.val;
                itering.remove();
                break;
            }
        }
        return found;
    }

    public String hashTabFind(String need) {
        for (int i = 0; i < 100; i++) {
            LinkedList<Contentt> temp = lst[i];
            if (!temp.isEmpty()) {
                for (Contentt x : temp) {
                    if (x.key.equals(need)) {
                        return "item found: " + x;
                    }
                }
            }
        }
        return "item didnt find(";
    }

    public static void main(String[] args) {
        HasgTab myOne = new HasgTab();
        myOne.hashTabInit();
        myOne.hashTabAdd("123", "hello,");
        myOne.hashTabAdd("234", "world!");
        myOne.hashTabAdd("345", "how r");
        myOne.hashTabAdd("456", "u?");
        myOne.hashTabAdd("qwer", "567");
        myOne.hashTabAdd("qwe", "567");
        myOne.hashTabAdd("qaz", "hello,");
        myOne.hashTabAdd("wsx", "world!");
        myOne.hashTabAdd("edc", "how r");
        myOne.hashTabAdd("rfv", "u?");
        myOne.hashTabAdd("tgb", "567");
        myOne.hashTabAdd("yhn", "567");
        myOne.hashTabAdd("qwertyuiop", "1234567890");
        myOne.hashTabLookUp();
        System.out.println();
        System.out.println(myOne.hashTabFind("123"));
        System.out.println();
        myOne.hashTabDelete("234");
        myOne.hashTabLookUp();
    }
}
