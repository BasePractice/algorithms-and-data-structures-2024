package ru.mirea.practice.s23k0155;

import java.util.HashMap;
import java.util.Map;

public abstract class Haffman {
    public static void main(String[] args) {

        String string = "AAABBC";
        HashMap<Character, Integer> elements = new HashMap<>();
        for (char letter : string.toCharArray()) {
            elements.put(letter, elements.getOrDefault(letter, 0) + 1);
        }

        int counter = 0;
        for (Map.Entry<Character, Integer> entry : elements.entrySet()) {
            counter++;
            System.out.println("Символ: " + entry.getKey() + " кол. повторов - " + entry.getValue());
        }

        Integer[] nums = new Integer[counter];
        Character[] sybols = new Character[counter];

        int i = 0;
        for (Map.Entry<Character, Integer> entry : elements.entrySet()) {
            nums[i] = (int) entry.getValue();
            sybols[i] = (char) entry.getKey();
            i++;
        }

        for (i = 0; i < counter; i++) {
            int pos = i;
            int min = nums[i];
            char s = sybols[i];
            for (int j = i + 1; j < counter; j++) {
                if (nums[j] < min) {
                    pos = j;
                    min = nums[j];
                    s = sybols[j];
                }
            }
            nums[pos] = nums[i];
            nums[i] = min;
            sybols[pos] = sybols[i];
            sybols[i] = s;
        }

        for (i = 0; i < counter; i++) {
            System.out.println(nums[i] + " " + sybols[i]);
        }

        HaffmansNode root = HaffmansNode.huffmansTree(elements);
        Map<Character, String> hafCode = new HashMap<>();
        HaffmansNode.generateCode(root, "", hafCode);

        System.out.println("Закодированные символы:");
        for (Map.Entry<Character, String> entry : hafCode.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }
}
