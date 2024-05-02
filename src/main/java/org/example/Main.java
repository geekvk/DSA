package org.example;

import com.sun.jdi.IntegerType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);

        int[] sarr = {15,18,13,23,12,9};
        System.out.println(findSecondMax(sarr));
        System.out.println(findSecondMinimum(sarr));
//        int[] array = new int[5];
//        for (int i=0;i<array.length;i++){
//            array[i] = in.nextInt();
//        }
//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
//        //modify
//        array[4] = 5604;
//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }

        /*
        2D array
        [ 1,2,3
          4,5,6
        ] 2x3
         */
        int[][]arr = new int[3][]; // adding rows is mandotory
        int[][] doubleArray = {
                {1,2,3},
                {3,5,6},
                {5,3,4}
        };
//        for (int row = 0;row<doubleArray.length;row++){
//            for (int column=0;column<doubleArray[row].length;column++){
//                System.out.print(doubleArray[row][column] + ",");
//            }
//            System.out.println();
//
//
//        }
        /*

        int[][]arr2 = {
                {1, 2, 3},
                {6,7},
                {4,5,8,34, 445}
        };

        int[][]input2DArray = new int[3][2];
        for (int row=0;row<input2DArray.length;row++){
            //for each col evry row
            for (int col=0;col<input2DArray[row].length;col++){
                input2DArray[row][col] = in.nextInt();
            }
        }
        for (int row = 0;row<input2DArray.length;row++){
            for (int column=0;column<input2DArray[row].length;column++){
                System.out.print(input2DArray[row][column] + ",");
            }
            System.out.println();


        }
        for (int[] a : input2DArray){
            System.out.println(Arrays.toString(a));
        }
        


        // Dynamic array -> ArrayList
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(5);
        list.add(45);
        list.add(45465);
        list.add(12);
        for (int i : list){
            System.out.println(i);
        }

         */




    }
    static int findSecondMax(int[]arr){
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                smax = max;
                max = arr[i];
            }
            if (arr[i]<max && arr[i]>smax){
                smax = arr[i];
            }
        }
        return smax;
    }

    static int findSecondMinimum(int[]arr){
        int min = Integer.MAX_VALUE;
        int sMin = Integer.MAX_VALUE;

        for (int i : arr){
            if (i<min){
                sMin = min;
                min = i;
            }
            if (i>min && i<sMin){
                sMin = i;
            }
        }
        return sMin;
    }
}