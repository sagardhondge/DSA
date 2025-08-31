package binarysearch;

public class sortedorderagnostic {
    public static void main(String[] args) {
        // Example with a sorted ascending array
        int[] sortedAscendingNums = {2, 3, 4, 5, 6, 8, 9};
        int targetAsc = 8;
        int ansAsc = orderAgonoisticBS(sortedAscendingNums, targetAsc);
        System.out.println("Result for ascending array: " + ansAsc);

        // Example with a sorted descending array
        int[] sortedDescendingNums = {9, 8, 6, 5, 4, 3, 2};
        int targetDesc = 5;
        int ansDesc = orderAgonoisticBS(sortedDescendingNums, targetDesc);
        System.out.println("Result for descending array: " + ansDesc);
    }

    static int orderAgonoisticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // Find whether the array is ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            // Find the middle element's index
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Array is descending
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
