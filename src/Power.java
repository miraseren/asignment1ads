/**
 * Calculates the power of a number using recursion.
 *
 * @param a the base number
 * @param n the exponent
 * @return the result of a raised to the power of n
 */
 class Power {

    public static int power(int a, int n) {
        if (n == 0) {
            return 1; // any number raised to the power of 0 is 1
        } else {
            return a * power(a, n - 1); // a^n = a * a^(n-1)
        }
    }

    public static void main(String[] args) {
        int a = 2;
        int n = 10;
        int result = power(a, n);
        System.out.println(a + "^" + n + " = " + result);
    }
}