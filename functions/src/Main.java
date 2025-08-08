import java.util.Scanner;

public class Main {
//    public static void main(String[] args) {
//    sum();// Function is made
//
//
//    }
//    static void sum(){ // sum() is an function it is called here using method
//        Scanner in = new Scanner(System.in);
//        System.out.println("enter the num1");
//        int num1 = in.nextInt();
//        System.out.println("Enter the num2");
//        int num2 = in.nextInt();
//        int sum = num1+ num2;
//        System.out.println("the sum is"+ sum);
//    }

    public static void main(String[] args) {
        int ans = sum3(20,30);
        System.out.println(ans);
    }

    static int sum3(int a, int b){
        int sum = a+b;
        return sum;
    }

}