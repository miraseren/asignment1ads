public class GCD {

    public static int gcd(int a, int b) {
        if (b == 0) { // if b is 0, GCD is a
            return a;
        } else {
            return gcd(b, a % b); //// recursively call gcd with b and the remainder of a divided by b
        }
    }

    public static void main(String[] args) {
        int a1 = 32, b1 = 48;
        System.out.println("GCD(" + a1 + ", " + b1 + ") = " + gcd(a1, b1));

        int a2 = 10, b2 = 7;
        System.out.println("GCD(" + a2 + ", " + b2 + ") = " + gcd(a2, b2));
    }
}