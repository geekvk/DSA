package org.example.sorting.selection_sort;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,5,1,2,3};
        int last = arr.length - 1;
//        System.out.println(getMaxIndex(arr, 0, last));
        printArray(selectionSort1(arr));
    }

    static int[] selectionSort1(int[] arr){
        for (int i = 0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr, 0, last);
//            int temp = arr[last];
//            arr[last] = arr[maxIndex];
//            arr[maxIndex] = temp;
            swap(arr,maxIndex, last);
        }
        return arr;
    }


    static int getMaxIndex(int[] arr, int start, int last){
        int maxIndex = 0;
        for (int i = start; i<=last; i++){
            int max = arr[maxIndex];
            if (max < arr[i]){
                maxIndex = i;
            }

        }
        return maxIndex;
    }

    static void swap(int[] arr, int first, int last){
        int temp = arr[last];
        arr[last] = arr[first];
        arr[first] = temp;
    }

    static void printArray(int[] arr){
        for (int a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
    }
}
