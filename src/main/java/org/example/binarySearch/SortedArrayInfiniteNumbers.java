package org.example.binarySearch;

public class SortedArrayInfiniteNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20};
        System.out.println(searchTarget(arr, 15));

    }
    /*
    // array length is not knowing
    static int searchTarget(int[] arr, int target){
        //find the range
        // first start with a box of size
        int start = 0;
        int end = 1;

        //condition for target to lie in the range
        while (target > arr[end] && end < arr.length){
           int newStart = end + 1;
           //double the box value
            // end = end + sizeofBox * 2
           end = end +  (end - start + 1) * 2;
           /*
           find the size of 6 to 12
                [2,3,4,5,6,7,8,9,12,34]
                 | | | | | | | | |  |
                 0 1 2 3 4 5 6 7 8  9
                         S-------E

                        indexes (8 - (6-3)) = 5
                         (E - (S - 1))  = E - S + 1
                (E - S) = 8 - 4 = 4
                size = 4 + 1 = 5

                therefore
                size of the box = (E - S + 1)


            start = newStart;


        }
        return binarySearch(arr,target,start,end);


    }

     */
    static int searchTarget(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Find the range
        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;

            // Double the box value
            end = end + (end - start + 1) * 2;

            // Update start
            start = newStart;
        }

        // Perform binary search within the determined range
        return binarySearch(arr, target, start, Math.min(end, arr.length - 1));
    }
    static int binarySearch(int[] arr, int target, int start, int end){
        while (start <= end){
            int mid = start + (end - start)/2;
            if (arr[mid] < target){
                start = mid + 1;
            }else if(arr[mid] > target){
                end = mid - 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}
