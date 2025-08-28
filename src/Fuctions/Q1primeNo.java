// to check the number is prime or not using an fuction and method
package Fuctions;
import java.util.Scanner;

public class Q1primeNo {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=  in.nextInt();
        boolean ans = isPrime(n);
        System.out.println(isPrime(n));
    }
    static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        int c=2;
        while (c*c <=n){
            if (n%c==0){
                return false;
            }
            c++;
        }
        if (c*c>n){
            return true;
        }
        return false;
    }
}
