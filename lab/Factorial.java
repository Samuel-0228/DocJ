import java.util.Scanner;

public class Factorial {
    
    // Iterative version (efficient, no stack overflow risk)
    public static long factorialIterative(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        long result = 1;
        for (int i = 1; i <= n; ++i) {
            result *= i;
        }
        return result;
    }
    
    // Recursive version (clean but risks stack overflow for large n > ~10000)
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Factorial not defined for negative numbers");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a non-negative integer: ");
        int num = scanner.nextInt();
        scanner.close();
        
        System.out.println("Iterative: " + num + "! = " + factorialIterative(num));[web:50][web:54]
        System.out.println("Recursive: " + num + "! = " + factorialRecursive(num));[web:51][web:55]
    }
}
