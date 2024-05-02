package org.example.binarySearch;

import java.util.Arrays;

/*
https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 */
public class FindFirstAndLast {
    public static void main(String[] args) {
        int[] arr = { 5,7,7,7,7,8,8,10};
        int[] ans = searchTarget(arr,8);
        int rounds = ans[1] - ans[0];
        System.out.println(rounds + 1);
        System.out.println(Arrays.toString(searchTarget(arr,8)));
    }

    static int binarySearch(int[]arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
    // this will return the index value
    static int search(int[]arr, int target, boolean isFirstElement){
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isFirstElement == true){
                    end = mid - 1;
                }else {
                    start = mid + 1;
                }
            }
        }
        return ans;

    }
    static int[] searchTarget(int[] arr, int target){
        int[] ans = { -1,-1};
        int first = search(arr, target,true);
        int last = search(arr, target, false);

        ans[0] = first;
        ans[1] = last;
        return new int[]{first,last};
    }
}
