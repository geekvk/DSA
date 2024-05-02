package org.example.linear_search;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {2,3,45,667,32,344,56};
        System.out.println(linearSearch(arr, 667));
        System.out.println(linearSearch(arr, 22));

        String name = "Harry Potter is a wizard";
        char target = 'q';
        System.out.println(searchString(name,target));
        System.out.println(searchString2(name,target));
        System.out.println(name.toCharArray());
    }
    static int linearSearch(int[]arr, int searchElement){
        if (arr.length == 0){
            return -1;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i] == searchElement){
                return i;
            }
        }
        // executes if none of the statements above has executed
        return -1;
    }

    // search in strings
    static boolean searchString(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
    static boolean searchString2(String str, char target){
        if (str.length() == 0){
            return false;
        }
        for (char ch:str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
