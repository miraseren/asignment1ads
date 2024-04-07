public class Fibonacci {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0; // F0 = 0
        } else if (n == 1) {
            return 1; // F1 = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // formula of fibonacci sequence
        }
    }

    public static void main(String[] args) {
        int n1 = 5;
        System.out.println(fibonacci(n1));

        int n2 = 17;
        System.out.println(fibonacci(n2));
    }
}