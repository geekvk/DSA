package org.example.binarySearch;

/*
Ceiling => smallest element in the array greater or equal to target
ex : arr = { 2,3,5,9,14,16,18}

target = 14, ceiling = 14
target = 15, ceiling = 16
target = 5, ceiling = 9
 */
public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceilingNumber(arr, 13));
    }
    static int ceilingNumber(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        if (target > arr[end]){
            return -1;
        }
        while (start <= end){
            int mid = start + (end - start)/2;
            if (target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid  + 1;

            }else {
                return arr[mid];
            }
        }
        // if target is not available
        return arr[start];
    }
}
