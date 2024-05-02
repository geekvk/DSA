package org.example.binarySearch;

/*
https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
 */
public class PeakIndex {
    public static void main(String[] args) {

    }

    private int findPeakIndex(int arr[]){
        int start = 0;
        int end = arr.length - 1;
       if(arr.length >= 3){
           while(start <= end){
               int mid = start + (end - start)/2;

               if (arr[mid] > arr[mid+1] && arr[mid] < arr[mid - 1]){
                   return mid;
               }
           }

       }
       return -1;
    }
}
