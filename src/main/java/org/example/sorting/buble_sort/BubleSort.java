package org.example.sorting.buble_sort;

public class BubleSort {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,2};
        int[] newArr = bubleSort(arr);
        System.out.println("UnSorted:");
        printArray(arr);
        System.out.println("Sorted:");
        printArray(newArr);
    }

    static int[] bubleSort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j = 1;j<arr.length - i; j++){
                if (arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static void printArray(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }

}
