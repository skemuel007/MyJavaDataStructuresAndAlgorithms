package java_arrays;
import java.util.*;

public class Fibonacci_Recursion {

    // sum of first two preciding numbers
    // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
    public static void main(String[] args) {

    }

    public static int fibonnaci(int n) {
        if ( n < 0 ) {
            return -1;
        }
        if ( n == 0 || n == 2) {
            return n;
        }
        return fibonnaci(n - 1) + fibonnaci(n - 2);
    }
}

