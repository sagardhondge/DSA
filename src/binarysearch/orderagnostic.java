package binarysearch;

public class orderagnostic {
    public static void main(String[] args) {
        int[] nums={-18,-12,-4,0,2,3,4,5,6,7,8};
        int target=5;
        int ans =orderAgonoisticBS(nums,target);
        System.out.println(ans);
    }
    static int orderAgonoisticBS(int[] arr,int target ){
        int start=0;
        int end=arr.length-1;

        //find weather the array is ascending or descending
        boolean isAsc = arr[start]<arr[end];

        while (start<=end){
            // Find the middle element's index
            int mid = start +(end -start)/2;

            if(arr[mid]==target){
               return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                }else {
                    start=mid+1;
                }
            }else {
                if (target>arr[mid]){
                    end=mid-1;
                }else{
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
