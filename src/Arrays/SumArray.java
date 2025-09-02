package Arrays;

public class SumArray {
    public static int sum(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] myArray = {10, 20, 30, 40};
        int totalSum = sum(myArray);
        System.out.println("Sum: " + totalSum);
        // Output: Sum: 100
    }
}