package org.example.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
        int[]arr = {2,4,6,9,11,12,14,20,36,48};
        int[] arr2 = {334,242,112,50,22,5,2};
        System.out.println(findTarget(arr,36));
        System.out.println(findTarget(arr,9));

        System.out.println(orderAgnosticBinarySearch(arr2,242));
    }

    //return -1 if it doesn't exist
    static int findTarget(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while (start <= end){
            // (start + end)/2 in bigger number exceeds integer range
            int mid = start + (end - start)/2;
            if(target > arr[mid]){
                start = mid + 1;
            }else if (target < arr[mid]){
                end = mid - 1;
            }else{
                return mid;
            }

        }
        return -1;
    }
    /*
     if arr[start] < arr[end] => increasing order
     if arr[start] > arr[end] => decreasing order
     */
    static int orderAgnosticBinarySearch(int[]arr, int target){
        int start = 0;
        int end = arr.length - 1;

        if (arr[start] < arr[end]){
            while (start <= end){
                int mid = start + (end - start)/2;
                if (target < arr[mid]){
                    end = mid - 1;
                }else if(target > arr[mid]){
                    start = mid  + 1;
                }else
                    return mid;
            }
        }else if (arr[start] > arr[end]){
            while (start <= end){
                int mid = start + (end - start)/2;
                if (target < arr[mid]){
                    start = mid + 1;
                }else if(target > arr[mid]){
                    end = mid - 1;
                }else{
                    return mid;
                }
            }
        }
        return -1;
    }
}
