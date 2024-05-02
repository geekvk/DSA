package org.example.linear_search;

public class SerchInRange {
    public static void main(String[] args) {
        int[] arr = { 12,34,56,33,343,55,4443,37};
        System.out.println(searchInRange(arr,12,2,5));

    }
    public static boolean searchInRange(int[] arr, int target, int rangeMinIndex, int rangeMaxIndex){
        if (arr.length ==0){
            return false;
        }
        for (int i = rangeMinIndex;i<=rangeMaxIndex;i++){
            if (arr[i] == target){
                return true;
            }
        }
        return false;
    }
}
