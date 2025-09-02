package binarysearch;

public class FindMinimum {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            int mid = low + (high - low) / 2;

            // If mid element is greater than high, the minimum must be in the right subarray
            if (nums[mid] > nums[high]) {
                low = mid + 1;
            }
            // The minimum is either mid or in the left subarray
            else {
                high = mid;
            }
        }
        return nums[low];
    }
}