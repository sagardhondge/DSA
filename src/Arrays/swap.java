package Arrays;

import java.util.Arrays;

public class swap {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        // Example 1: Swapping two specific elements
        System.out.println("Original array: " + Arrays.toString(arr));
        swap(arr, 0, 4); // Swaps the elements at index 0 and 4
        System.out.println("After single swap: " + Arrays.toString(arr));

        System.out.println(); // Add a blank line for clarity

        // Example 2: Reversing the entire array
        int[] arr2 = {10, 20, 30, 40, 50};
        System.out.println("Original array for reversal: " + Arrays.toString(arr2));
        reverse(arr2);
        System.out.println("After reversal: " + Arrays.toString(arr2));
    }

    // Method to swap two elements in an array
    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    // Method to reverse the entire array
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }
}