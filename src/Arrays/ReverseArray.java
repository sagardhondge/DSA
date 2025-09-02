package Arrays;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int[] myArray = {1, 2, 3, 4, 5};
        reverse(myArray);
        for (int i : myArray) {
            System.out.print(i + " ");
        }
        // Output: 5 4 3 2 1
    }
}