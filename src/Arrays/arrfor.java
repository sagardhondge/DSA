package Arrays;

import java.util.Scanner;

public class arrfor {
    public static void main(String[] args) {

        Scanner in =new Scanner (System.in);
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("The elements of the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
