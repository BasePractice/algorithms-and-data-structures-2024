package Task4;

public class HarmonicSeries {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s%n", "n", "H(n)");
        for (int n = 1; n <= 10; n++) {
            double harmonic = 0;
            for (int i = 1; i <= n; i++) {
                harmonic += 1.0 / i;
            }
            System.out.printf("%-10d %-10.6f%n", n, harmonic);
        }
    }
}
