import java.util.Arrays;
import java.util.Random;

public class First {

    public static void main(String[] args) {
        int arraySize = 10;

        double[] mathRandomArray = new double[arraySize];

        for (int i = 0; i < arraySize; i++) {
mathRandomArray[i] = Math.random();
        }

        System.out.println("Массив, сгенерированный с использованием Math.random():");
        System.out.println(Arrays.toString(mathRandomArray));

        Arrays.sort(mathRandomArray);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(mathRandomArray));

        double[] randomArray = new double[arraySize];
        Random random = new Random();

        for (int i = 0; i < arraySize; i++) {
randomArray[i] = random.nextDouble();
        }

        System.out.println("\nМассив, сгенерированный с использованием Random:");
        System.out.println(Arrays.toString(randomArray));

        Arrays.sort(randomArray);

        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(randomArray));
    }
}

