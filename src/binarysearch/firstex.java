package binarysearch;

public class firstex {
    public static int binarySearch(int[] sortedArray, int target) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2; // Find the middle index

            if (sortedArray[mid] == target) {
                return mid; // Target found, return its index
            } else if (sortedArray[mid] < target) {
                low = mid + 1; // Target is in the upper half
            } else {
                high = mid - 1; // Target is in the lower half
            }
        }
        return -1; // Target not found
    }

    public static void main(String[] args) {
        int[] myList = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int targetNumber = 23;

        int index = binarySearch(myList, targetNumber);

        if (index != -1) {
            System.out.println("Target found at index: " + index);
        } else {
            System.out.println("Target not found in the array.");
        }
    }

}
