package Arrays;

public class Max {
    public static void main(String[] args) {
        int [] arr = {1, 2,3, 4, 5};
        System.out.println(max(arr));
    }
    public static int max(int[]arr){
        int  maxVal = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i]> maxVal){
                maxVal=arr[i];
            }
        }
        return maxVal;
    }
}
