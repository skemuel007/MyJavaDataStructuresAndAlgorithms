package java_arrays;

public class Factorial_Recursion {
    public static void main(String[] args) {

    }

    public static int factorial(int n) {
        if (n < 0) {
            return -1;
        }
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}
