package org.example.linear_search;

import java.util.Arrays;

public class TwoDArray {
    public static void main(String[] args) {
        int[][]arr = {
                {342,33332,534,43331},
                {444325,332,33324,5334},
                {450,320,458,22},
                {34,5444446,4545,44}
        };

        int[]ans = search(arr,22);
        System.out.println(Arrays.toString(ans));
        System.out.println(findMax(arr));
        System.out.println(findMin(arr));

    }
    static int[] search(int[][]arr, int target){
        for (int row = 0;row<arr.length;row++){
            for (int col = 0;col<arr[row].length;col++){
                if (arr[row][col] == target){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1,-1};
    }

    static int findMax(int[][]arr){
        int max = arr[0][0];
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col] > max){
                    max = arr[row][col];
                }
            }
        }
        return max;
    }

    static int findMin(int[][] arr){
        int min = Integer.MAX_VALUE;
        for (int row =0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col] < min){
                    min = arr[row][col];
                }
            }
        }
        return min;
    }
}
