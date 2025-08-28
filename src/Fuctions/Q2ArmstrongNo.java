//armstrong numbers means the when we took an three digit no and then and
//seprate it like 1+5+3 taking cube of each no like 1^3=1,5^3=125& 3^3=9
//when we add 1+125+27=153 then it is said to be armstrong no.
package Fuctions;
import java.util.Scanner;

public class Q2ArmstrongNo {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=  in.nextInt();
        boolean ans = isArmstrong(n);
        System.out.println(isArmstrong(n));
    }
    static boolean isArmstrong (int n){
        int original = n;
        int sum =0;

        while(n>0){
            int rem =n % 10;
            n= n/10;
            sum = sum+ rem*rem*rem;

        }
        if (sum== original){
            return true;
        }
        return false;
    }
}
