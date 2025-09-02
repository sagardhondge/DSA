package Linearsearch;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] myArray = {12, 34, 56, 78, 90};
        int target = 56;
        int index = linearSearch(myArray, target);
        System.out.println("Element found at index: " + index);
        // Output: Element found at index: 2
    }
}