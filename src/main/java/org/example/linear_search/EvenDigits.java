package org.example.linear_search;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/solutions/3472781/easiest-java-solution-for-beginners/
public class EvenDigits {
    public static void main(String[] args) {
        int[]arr = {12,345,2,6,7896};
        System.out.println(findEventDigits(arr));
    }
    static int countDigits(int number){
        if (number <0){
            number = number * -1;
        }
        if (number == 0){
            return 1;
        }
        int count = 0;
        while (number != 0){
            number /= 10;
            count++;
        }
        return count;
    }
    static int findEventDigits(int[] arr){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            int countDigit = countDigits(arr[i]);
            if (countDigit %2 == 0){
                count++;
            }
        }
        return count;
    }
}
