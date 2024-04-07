public class Factorial {

    public static int factorial(int n) {
        int result = 1; // initializing result variable
        for (int i = 1; i <= n; i++) {  //product of all numbers from 1 to n
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        int result = factorial(n);
        System.out.println(result);
    }
}