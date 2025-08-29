package Linearsearch;

public class searchinrange {
    public static void main(String[] args) {
        int[] arr ={13, 14, 15,-7,56};
        int target=90;
        System.out.println(linearserach(arr,target,1,4));

    }
    static int linearserach(int[] arr, int target,int start,int end) {
        if (arr.length == 0) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }
}
