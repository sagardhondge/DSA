package Linearsearch;

public class sqrt {
        public static int mySqrt(int x) {
            if (x < 2) return x;  // 0 -> 0, 1 -> 1

            int left = 1, right = x / 2, ans = 0;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                // To avoid overflow, compare mid with x/mid
                if (mid <= x / mid) {
                    ans = mid;      // mid^2 <= x, so mid is a candidate
                    left = mid + 1; // try for bigger
                } else {
                    right = mid - 1; // mid^2 > x, go smaller
                }
            }
            return ans;
        }

        public static void main(String[] args) {
            System.out.println(mySqrt(4));  // Output: 2
            System.out.println(mySqrt(8));  // Output: 2
            System.out.println(mySqrt(25)); // Output: 5
        }
    }
