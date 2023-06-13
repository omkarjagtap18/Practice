// public class Fibonacci {
    
//     public static void main(String[] args) {
//         int a=0, b=1, c;
//         System.out.print(a+" "+b);
//         for(int i=1; i<= 10; i++){
//             c=a+b;
//             System.out.print(" "+c);
//             a=b;
//             b=c;
//         }
//     }
// }
public class Fibonacci {
    
    public static void main(String[] args) {
        int a = 0, b = 1, c;
        int n = 10; // Number of Fibonacci numbers to generate
        
        // Create an array to store the Fibonacci series
        int[] fibonacciSeries = new int[n];

        fibonacciSeries[n - 1] = a;
        fibonacciSeries[n - 2] = b;

        for (int i = n - 3; i >= 0; i--) {
            c = a + b;
            fibonacciSeries[i] = c;
            a = b;
            b = c;
        }

        // Print the reversed Fibonacci series
        for (int num : fibonacciSeries) {
            System.out.print(num + " ");
        }
    }
}
