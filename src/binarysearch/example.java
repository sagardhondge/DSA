//binary search algorithim using ascending array
package binarysearch;

public class example {
    public static void main(String[] args) {
        int []nums={1,2,3,4,5,6,7};
        int target =5;
        int ans =binarysearch(nums,target);
        System.out.println(ans);
    }
    static int binarysearch(int[]arr,int target){
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            // Find the middle element's index
            int mid = start +(end -start)/2;

            // Check if the target is at the middle
            if (target<arr[mid]){
                end=mid-1;

                // If the target is greater, ignore the left half
            }else if (target>arr[mid]){
                start=mid-1;
            }else{
                return mid;
            }
        }

        return -1;
    }
}
