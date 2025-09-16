// an bsa example to floor the class means finding an smallest target value in the for geater no
// floor means greatest no<=target
package binarysearch;

public class Q2FloorNo {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 11, 13, 15, 16};
        int target=4;
        int ans= floor(arr,target);
        System.out.println(ans);
    }
    static int floor(int[] arr, int target){
        int start =0;
        int end=arr.length-1;

        while (start<= end){
            int mid=start+(end-start)/2;

            if (target<arr[mid]){
                end = mid -1;
            } else if (target>arr[mid]) {
                start=mid+1;
            }else{
                return mid;
            }
        }
        return end;
    }
}
