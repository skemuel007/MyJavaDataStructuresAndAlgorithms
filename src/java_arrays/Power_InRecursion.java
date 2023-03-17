package java_arrays;

public class Power_InRecursion {
    public static void main(String[] args) {
        var powerTest = power(2, 5);
        System.out.println(powerTest);
    }

    public static int power(int base, int exponential) {
        if (exponential == 0 || exponential < 0)
            return 1;
        return base * power(base, exponential - 1);
    }
}
