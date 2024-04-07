/**
 * Checks if a number is prime.
 *
 * @param n the number to check
 * @return true if the number is prime, false otherwise
 */
public class PrimeNum{

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime numbers
        }

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false; // If n is divisible by any number between 2 and n-1, it's not prime
            }
        }

        return true; // If n is not divisible by any number between 2 and n-1, it's prime
    }

    public static void main(String[] args) {
        int number1 = 7;
        int number2 = 10;

        System.out.println(number1 + (isPrime(number1) ? " is a prime number." : " is not a prime number."));
        System.out.println(number2 + (isPrime(number2) ? " is a prime number." : " is not a prime number."));
    }
}