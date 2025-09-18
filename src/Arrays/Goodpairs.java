package Arrays;

public class Goodpairs {
    // Function to count good pairs
    public static int numIdenticalPairs(int[] nums) {
        int count = 0;
        int[] freq = new int[101];
        for (int num : nums) {
            count += freq[num];
            freq[num]++;
        }
        return count;
    }

    // Main method to test the function
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        int[] nums2 = {1, 1, 1, 1};
        int[] nums3 = {1, 2, 3};

        System.out.println("Output 1: " + numIdenticalPairs(nums1));
        System.out.println("Output 2: " + numIdenticalPairs(nums2));
        System.out.println("Output 3: " + numIdenticalPairs(nums3));
    }
}
