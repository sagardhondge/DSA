package Linearsearch;

public class main {
    public static void main(String[] args) {
        int[] nums ={23,24,25,1,2,3,4,5,6,-22,34};
        int target =5;
        int ans =linearserach(nums,target);
        System.out.println(ans);
    }
    static int linearserach(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
