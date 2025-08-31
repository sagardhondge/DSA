package binarysearch;

public class orderagnostic {
    public static void main(String[] args) {
        int[]
    }
    static int orderAgonoisticBS(int[] arr,int target ){
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
    }
}
