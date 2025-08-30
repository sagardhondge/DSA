// program to insert an element at an certain position in array
package Linearsearch;

import java.util.Scanner;

public class insertatposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get size of the array
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size + 1]; // +1 for new element

        // Input elements
        System.out.println("Enter " + size + " elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Element to insert
        System.out.print("Enter the element to insert: ");
        int element = sc.nextInt();

        // Position to insert (1-based index)
        System.out.print("Enter the position (1 to " + (size + 1) + "): ");
        int pos = sc.nextInt();

        if (pos < 1 || pos > size + 1) {
            System.out.println("Invalid position!");
        } else {
            // Shift elements to the right
            for (int i = size; i >= pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos - 1] = element;
            size++;

            // Print updated array
            System.out.println("Array after insertion:");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
