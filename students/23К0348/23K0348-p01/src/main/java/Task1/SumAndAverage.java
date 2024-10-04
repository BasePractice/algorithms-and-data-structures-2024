package Task1;

public class SumAndAverage {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        double average = (double) sum / numbers.length;
        System.out.println("Сумма: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}

