package Linearsearch;

public class findmin {
    public static void main(String[] args) {
       int[]arr ={14,24,35,40,34};
        System.out.println(min(arr));
    }
    static int min(int[]arr){
        int ans =arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<ans){
                 ans= arr[i];
            }
        }
        return ans;
    }
}
