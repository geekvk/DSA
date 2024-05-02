package org.example.linear_search;
//https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3},{3,2,1}};
        System.out.println(findMaxWeath(arr));
//        maxWealth(arr);
    }
    static int findMaxWeath(int[][]arr){
        int maxWealth = Integer.MIN_VALUE;

        for (int customer = 0;customer<arr.length;customer++){
            int wealth = 0;
            for (int bank = 0;bank<arr[customer].length;bank++){
                wealth += arr[customer][bank];
            }
            if (wealth > maxWealth){
                maxWealth = wealth;
            }
        }
        return maxWealth;
    }

    static void maxWealth(int[][]arr){
        int maxWealth = 0;
        int wealth = 0;
        for (int customer = 0;customer<arr.length;customer++){
            for (int bank = 0;bank<arr[customer].length;bank++){
                wealth += arr[customer][bank];
                System.out.println(wealth);
                if (wealth > maxWealth){
                    maxWealth = wealth;
                }
            }
        }
    }
}
