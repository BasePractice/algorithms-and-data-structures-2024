package ru.mirea.practice.s0000001.num3;

public final class PhoneNumber {
    private PhoneNumber() {
    }

    public static String format(String num) {
        String formatted = num.replaceAll("[^0-9]", "");
        if (formatted.startsWith("8")) {
            formatted = "+7" + formatted.substring(1);
        }
        return formatted.substring(0, 3) + "-" + formatted.substring(3, 6) + "-" + formatted.substring(6, 10);
    }

    public static void main(String[] args) {
        String[] nums = {"+79175655655", "+104289652211", "89175655655"};
        for (String num : nums) {
            System.out.println("Отформатированный номер: " + format(num));
        }
    }
}
