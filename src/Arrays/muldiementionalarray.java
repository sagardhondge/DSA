package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class muldiementionalarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] arr = new int [3][3];
        System.out.println(arr.length);

        //input
        for (int row = 0; row < arr.length; row++) {
            // for each cloumn in a row
            for (int col = 0; col < arr[row].length ; col++) {
                arr[row][col] = in.nextInt();
            }
         }

        //output
        for (int row = 0; row < arr.length; row++) {
            // for each col in row
            for (int col = 0; col < arr[row].length ; col++) {
                System.out.print(arr[row][col]+ " ");
            }
            System.out.println();
        }

        // array using to string
        for (int row = 0; row < arr.length; row++) {
            System.out.println(Arrays.toString(arr[row]));
        }
    }
}
