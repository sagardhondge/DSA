// program to search an element in an array
package Linearsearch;
import java.util.Scanner;

public class searchznelemnt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking array size from user
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Taking array elements from user
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Taking element to search
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        // Linear Search logic
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element " + key + " found at position " + (i + 1));
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Element " + key + " not found in the array.");
        }

        sc.close();
    }
}
