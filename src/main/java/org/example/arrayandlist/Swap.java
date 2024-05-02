package org.example.arrayandlist;

import java.util.Arrays;

public class Swap {
    public static void main(String[] args) {
        int[]arr = {1,505,43,45,16};
        swap(arr,1,3);
        System.out.println(Arrays.toString(arr));
        System.out.println(getMax(arr));
        reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
    static int getMax(int[]arr){
        int max = arr[0];
        for (int i=0;i<arr.length;i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
    static void reverseArray(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}
