/**
 * Calculates the binomial coefficient C(n, k).
 *
 * @param n the total number of items
 * @param k the number of items to choose
 * @return the binomial coefficient C(n, k)
 */
public class BinomialCoefficient {

    public static int binomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1; // C(n, 0) = C(n, n) = 1
        }

        int result = 1;
        for (int i = 1; i <= k; i++) { // this loop calculates the binomial coefficient by incrementing result variable
            result = result * (n - i + 1) / i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n1 = 2;
        int k1 = 1;
        System.out.println("C(" + n1 + ", " + k1 + ") = " + binomialCoefficient(n1, k1));

        int n2 = 7;
        int k2 = 3;
        System.out.println("C(" + n2 + ", " + k2 + ") = " + binomialCoefficient(n2, k2));
    }
}