package Arrays;


    public class SecondLargest {
        public static int secondLargest(int[] arr) {
            if (arr.length < 2) {
                System.out.println("Array must have at least 2 elements");
                return -1;
            }

            int first = Integer.MIN_VALUE;
            int second = Integer.MIN_VALUE;

            for (int num : arr) {
                if (num > first) {
                    second = first;
                    first = num;
                } else if (num > second && num != first) {
                    second = num;
                }
            }

            if (second == Integer.MIN_VALUE) {
                System.out.println("No second largest element found");
                return -1;
            }
            return second;
        }

        public static void main(String[] args) {
            int[] arr = {12, 35, 1, 10, 34, 1};
            int result = secondLargest(arr);
            if (result != -1) {
                System.out.println("Second largest element is: " + result);
            }
    }
}
