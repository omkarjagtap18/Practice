import java.util.ArrayList;
import java.util.Collections;

public class FibonacciReverseOrder {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to generate

        // Generate the Fibonacci series
        ArrayList<Integer> fibonacciSeries = generateFibonacciSeries(n);

        // Reverse the Fibonacci series
        Collections.reverse(fibonacciSeries);

        // Print the reversed Fibonacci series
        for (int num : fibonacciSeries) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> generateFibonacciSeries(int n) {
        ArrayList<Integer> fibonacciSeries = new ArrayList<>();

        fibonacciSeries.add(0); // First Fibonacci number
        fibonacciSeries.add(1); // Second Fibonacci number

        for (int i = 2; i < n; i++) {
            int num = fibonacciSeries.get(i - 1) + fibonacciSeries.get(i - 2);
            fibonacciSeries.add(num);
        }

        return fibonacciSeries;
    }
}
