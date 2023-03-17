package java_arrays;

public class SumOfDigits {
    public static void main(String[] args) {
        var sumedDigits = sumOfDigits(23445);
        System.out.println(sumedDigits);
    }

    public static int sumOfDigits(int num) {
        if ( num == 0 || num < 0) {
            return 0;
        }
        return num % 10 + sumOfDigits(num / 10);
    }
}
