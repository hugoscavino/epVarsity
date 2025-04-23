/**
 *
 * ### Explanation:
 * - The base case is when `m % n == 0`, in which case `n` is the GCD.
 * - The recursive case computes `gcd(n, m % n)` until the base case is reached.
 * - This method uses **Euclid's algorithm**, which is efficient and
 *   elegant for computing the greatest common divisor.
 */
public class GCDCalculator {

    public static int gcd(int m, int n) {
        if (m % n == 0) {
            return n;
        } else {
            return gcd(n, m % n);
        }
    }

    public static void main(String[] args) {
        int m = 48;
        int n = 18;
        System.out.println("GCD of " + m + " and " + n + " is: " + gcd(m, n));

        m = 7;
        n = 1;
        System.out.println("GCD of " + m + " and " + n + " is: " + gcd(m, n));
    }
}