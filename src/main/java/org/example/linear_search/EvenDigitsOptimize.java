package org.example.linear_search;

public class EvenDigitsOptimize {
    public static void main(String[] args) {
        System.out.println(countDigits(23345));
        int[]arr = {12,345,2,6,7896};
        System.out.println(findNumbers(arr));
    }
    static int countDigits(int number){
        return (int)(Math.log10(number)) + 1;
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for (int i=0;i<nums.length;i++){
            int countDigits = countDigits(nums[i]);
            if (countDigits % 2 == 0){
                count++;
            }
        }
        return count;
    }
}
