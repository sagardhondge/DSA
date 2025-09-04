package Arrays;

public class MissingNumber {

    // Function to find missing number
    public static int findMissing(int[] arr, int n) {
        int totalSum = n * (n + 1) / 2; // Sum of first n natural numbers
        int arrSum = 0;

        for (int num : arr) {
            arrSum += num;
        }

        return totalSum - arrSum; // Difference is the missing number
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        int n = 6; // Array should contain numbers from 1 to 6

        int missing = findMissing(arr, n);
        System.out.println("Missing number is: " + missing);
    }
}

