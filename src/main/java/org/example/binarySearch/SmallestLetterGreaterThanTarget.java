package org.example.binarySearch;

// smallest letter greater than to target
// if there is no character is larger than the target return the start
public class SmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] arr = {'c','f','j'};
        System.out.println(nextGreatestLetter(arr,'y'));
    }

    static char nextGreatestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start)/2;

            if (target < arr[mid]){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return arr[start % arr.length];
    }
}
