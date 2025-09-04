package Fuctions;

public class GCD {

    // Function to find GCD (Greatest Common Divisor)
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b); // Euclidean algorithm
    }

    public static void main(String[] args) {
        int a = 54, b = 24;
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
}
